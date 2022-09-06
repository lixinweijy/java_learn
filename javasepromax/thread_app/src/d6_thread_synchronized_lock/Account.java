package d6_thread_synchronized_lock;

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

    public void drawMoney(double money){
        lock.lock(); //上锁
        try {
            this.money-=money;
        } finally {//防止前面出错死锁
            lock.unlock(); //解锁
        }


    }
}
