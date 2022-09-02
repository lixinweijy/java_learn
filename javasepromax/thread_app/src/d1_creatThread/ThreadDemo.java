package d1_creatThread;
/*
多线程创建方式一：继承Thread类实现

优点：编码简单
缺点：已经继承了Thread类，无法继承其他类，不利于扩展
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //3.new一个新线程对象
        Thread t1=new MyThread();
        Thread t2=new MyThread();
        //4.调用start方法启动线程（执行的还是run方法，调用run还是当成普通方法执行，不会当成多线程执行），start会告诉cpu是多线程
        t1.start();
        t2.start();
    }
}
/*
定义一个线程类继承thread
 */
class MyThread extends Thread{
    /*
    2.重写run方法，里面是定义线程以后要干啥
     */

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
}