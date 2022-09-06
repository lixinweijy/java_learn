package d7_thread_comunication;

/**
 * Object类的等待和唤醒方法
 * 只有锁对象才可以调用
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //了解线程通信流程
        //三个爸爸存钱(生产者)，两个孩子取钱（消费者） 模拟线程通信思想(一存一取)
        //1.创建账户对象，代表五个人共同操作的账户
        Account acc=new Account("123444444",0);
        //2.创建两个取钱线程代表小明和小红
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();

        //3.创建三个存钱线程代表：亲爹，干爹，岳父
        new DepositThread(acc,"亲爹").start();
        new DepositThread(acc,"干爹").start();
        new DepositThread(acc,"岳父").start();

    }
}
