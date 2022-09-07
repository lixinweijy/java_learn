package d3_UDP_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
发送端
 */
public class ServerDemo1 {
    public static void main(String[] args) throws Exception{
        //1.创建发送端对象：发送端自带默认的端口号
        DatagramSocket socket=new DatagramSocket();

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg=sc.nextLine();

            if("exit".equals(msg)){
                socket.close();
                return;//结束
            }

            //2.创建一个数据包对象封装数据
            byte[] buffer=msg.getBytes();
            DatagramPacket packet=new DatagramPacket(buffer,buffer.length, InetAddress.getByName("255.255.255.255"),9999);

            //3.发送数据出去
            socket.send(packet);
        }

    }
}
