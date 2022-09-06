package d7_thread_comunication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;//余额 关键信息
    //final修饰后，唯一，不可替换
    private final Lock lock=new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //取钱
    public synchronized void drawMoney(double money){
        try {
            String name=Thread.currentThread().getName();
            if(this.money>=money){
                this.money-=money;
                System.out.println(name + "来取钱" + money + "成功!余额是" + this.money);

                //没钱了
                this.notifyAll();//唤醒所有线程
                this.wait();//进入等待
            }else {
                //钱不够
                //唤醒别人等待自己
                this.notifyAll();//唤醒所有线程
                this.wait();//锁对象，让当前线程进入等待！
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    public synchronized void deposite(double money){
        try {
            String name=Thread.currentThread().getName();
            if(this.money==0){
                //没钱了，存钱
                this.money+=money;
                System.out.println(name + "存钱" + money + "成功！余额为：" + this.money);
                //有钱了
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
