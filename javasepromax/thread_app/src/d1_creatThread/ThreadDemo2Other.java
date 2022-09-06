package d1_creatThread;
/*
学会线程创建方式2，理解他的优缺点
 */
public class ThreadDemo2Other {
    public static void main(String[] args) {
        //3.创建一个任务对象
        Runnable target=new MyRunnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程1执行输出：" + i);
                }
            }
        };
        Thread t=new Thread(target);
        t.start();

        //4.把任务对象交给Thread处理
        new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程2执行输出：" + i);
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}