package d6_socket2;

import d7_socket3.ServerReaderThread;
import d8_socket4.ServerReaderRunnable;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/*
实现多个客户端与服务端通信
 */
public class ServerDemo1 {
    private static ExecutorService pool=new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) throws Exception{
        try {
            System.out.println("==========服务端启动=========");
            //1.注册端口
            ServerSocket serverSocket=new ServerSocket(7777);

            while(true){
                //2.每接收到一个客户端的Socket管道，交给一个独立的子线程
                Socket socket=serverSocket.accept();
                pool.execute(new ServerReaderRunnable(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
