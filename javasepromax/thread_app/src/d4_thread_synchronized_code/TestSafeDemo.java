package d4_thread_synchronized_code;
//一：同步代码块
public class TestSafeDemo {
    /*
    用synchronized("常量"){关键代码}把会发生安全问题的代码圈起来，就会上一把锁，等一方执行完了其他的线程才会执行
     */
    //锁用任意唯一对象：
    //不好，会影响其他无关线程的执行
    //应该用共享资源锁对象
    /*
    synchronized(this){}这把锁就只会在这个类中有用，如果是常量，不仅针对这个类，还针对其他类
     */

    //静态方法用（类名.class）对象作为锁对象
}
