package d3_UDP_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 广播地址：255.255.255.255
 *
 *
 *
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception{
        //1.创建接收端对象
        DatagramSocket socket=new DatagramSocket(9999);

        //2.创建一个数据包对象接收数据
        byte[] buffer=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);

        while (true) {
            //3.等待接收数据
            socket.receive(packet);

            //4.取出数据即可
            int len=packet.getLength();
            String rs=new String(buffer,0,len);
            System.out.println("收到了：" + rs);

            //获取发送端的ip和端口
            String ip=packet.getSocketAddress().toString();
            System.out.println("对方地址：" + ip);
            int port=packet.getPort();
            System.out.println("对方端口：" + port);
        }
    }
}
