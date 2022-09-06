package d1_creatThread;
/*
线程创建方式2，理解他的优缺点

无法返回想要的值，只能运行代码
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //3.创建一个任务对象
        Runnable target=new MyRunnable();

        //4.把任务对象交给Thread处理
        Thread t=new Thread(target);
        //5.启动线程
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

/*
1.定义一个线程任务类，实现Runnable接口
 */
class MyRunnable implements Runnable{
    /*
    2.重写run方法，定义线程得到执行任务
     */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
}