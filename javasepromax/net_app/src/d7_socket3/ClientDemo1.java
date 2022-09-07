package d7_socket3;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
完成Socket网络变成入门案例的客户端开发，实现1发1收
客户端怎么发，服务器端怎么收，一端死亡，都死亡

是单线程的，只能接收一个客户端的信息
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        try{
            System.out.println("==========客户端==========");
            //1.创建socket通信管道请求有服务端的连接
            //public Socket(String host,int port)
            //参数一：服务端的IP地址
            //参数二：服务端的端口号
            Socket socket=new Socket("127.0.0.1",7777);

            //2.从Socket通信管道中得到一个字节输出流，负责发送数据
            OutputStream os=socket.getOutputStream();

            //3.把低级的字节流包装成打印流
            PrintStream ps=new PrintStream(os);

            //4.发送消息
            Scanner sc=new Scanner(System.in);
            while (true){
                System.out.println("请说:");
                String msg=sc.nextLine();
                ps.println(msg);
                ps.flush();
            }


            //不要随便关管道，要四次挥手，不然会有问题
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
