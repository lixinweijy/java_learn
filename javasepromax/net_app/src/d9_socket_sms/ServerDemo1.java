package d9_socket_sms;

import d8_socket4.ServerReaderRunnable;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class ServerDemo1 {
    //定义一个静态的List集合存储当前全部在线的socket管道
    public static List<Socket> allOnlineSockets=new ArrayList<>();
    public static void main(String[] args) throws Exception{
        try {
            System.out.println("==========服务端启动=========");
            //1.注册端口
            ServerSocket serverSocket=new ServerSocket(7777);

            while (true){
                //2.必须调用accept方法，等待接收客户端的socket连接请求，建立socket通信管道
                Socket socket=serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                allOnlineSockets.add(socket);
                //3、创建一个独立的线程来单独处理这个socket管道
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream is=socket.getInputStream();
            //4.把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader br=new BufferedReader(new InputStreamReader(is)/* 把字节输入流转换成字符输入流 */);
            //5.按照行读取消息
            String msg;
            while((msg=br.readLine())!=null){//这边收一行，那边要以行为单位
                System.out.println(socket.getRemoteSocketAddress() + "说了：" + msg);
                sendMsgToAll(msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            ServerDemo1.allOnlineSockets.remove(socket);
        }
    }

    private void sendMsgToAll(String msg) throws Exception{
        for (Socket socket: ServerDemo1.allOnlineSockets) {
            PrintStream ps=new PrintStream(socket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }


}