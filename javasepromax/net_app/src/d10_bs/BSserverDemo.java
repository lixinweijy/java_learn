package d10_bs;

import d7_socket3.ServerReaderThread;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class BSserverDemo {
    private static ExecutorService pool =new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws Exception{
        try {
            //1.注册端口
            ServerSocket ss=new ServerSocket(8080);
            //2.创建一个循环接收多个客户端的请求
            while(true){
                Socket socket=ss.accept();
                //3.交给一个独立的线程来处理
                pool.execute(new ServerReaderRunnable(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

