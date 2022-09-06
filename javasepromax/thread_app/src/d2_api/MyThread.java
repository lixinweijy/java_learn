package d2_api;

public class MyThread extends Thread{
    //也可以直接调用构造器取名字

    public MyThread(){

    }
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"输出：" + i);
        }
    }
}
