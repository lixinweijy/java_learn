package d7_thread_comunication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DepositThread extends Thread{
    private Account acc;
    public DepositThread(Account acc,String name){
        super(name);
        this.acc=acc;
    }

    @Override
    public void run() {
        //三个爸爸去存钱

        while (true) {
            acc.deposite(100000);
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
