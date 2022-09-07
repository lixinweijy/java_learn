package d5_socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
开发Socket网络编程入门代码的服务端，实现接收消息
 */
public class ServerDemo1 {
    public static void main(String[] args) throws Exception{
        try {
            System.out.println("==========服务端启动=========");
            //1.注册端口
            ServerSocket serverSocket=new ServerSocket(7777);
            //2.必须调用accept方法，等待接收客户端的socket连接请求，建立socket通信管道
            Socket socket=serverSocket.accept();
            //3.从socket通信管道中得到一个字节输入流
            InputStream is=socket.getInputStream();
            //4.把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader br=new BufferedReader(new InputStreamReader(is)/* 把字节输入流转换成字符输入流 */);
            //5.按照行读取消息
            String msg;
            while((msg=br.readLine())!=null){//这边收一行，那边要以行为单位
                System.out.println(socket.getRemoteSocketAddress() + "说了：" + msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
