package d2_UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
发送端
 */
public class ServerDemo1 {
    public static void main(String[] args) throws Exception{
        //1.创建发送端对象：发送端自带默认的端口号
        DatagramSocket socket=new DatagramSocket();

//        public DatagramPacket(byte buf[], int offset, int length) {
//            setData(buf, offset, length);
//        }
        //2.创建一个数据包对象封装数据
        byte[] buffer="啦啦啦阿拉蕾".getBytes();
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length, InetAddress.getLocalHost(),8888);

        //3.发送数据出去
        socket.send(packet);

        socket.close();
    }
}
