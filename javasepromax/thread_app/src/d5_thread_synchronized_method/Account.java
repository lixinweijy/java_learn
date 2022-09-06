package d5_thread_synchronized_method;

public class Account {
    private int money;

    public Account() {
    }

    public Account(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void drawMoney(double money){   //方法上面加了个synchronized,就能按顺序进行，和同步代码块原理一样，不过范围是整个方法
        //实例方法：默认用this作为锁对象
        //静态方法：默认用（类名.class）作为锁对象
    }
}
