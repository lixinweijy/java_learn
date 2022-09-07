package d4_UDP_multicast;

import java.net.*;

/**
 * 广播地址：255.255.255.255
 *
 *组播地址：224.0.0.1---239
 *
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception{

        MulticastSocket socket=new MulticastSocket(9999);

        //把接收端加入到一个组播组中去，绑定对应的组播消息的组播IP
//        socket.joinGroup(InetAddress.getByName("224.0.0.1"));
        socket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.0.1"),9999),    //同一网段下其他主机
                NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));        //本机地址所在的网段

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
