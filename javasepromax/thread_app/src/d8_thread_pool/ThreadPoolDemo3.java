package d8_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
使用Executors的工具方法直接得到一个线程池对象
 */
public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        //1.创建固定线程数据的线程池
        ExecutorService pool= Executors.newFixedThreadPool(3);

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());//已经没有多余线程了
    }
}
/*  大型项目会有问题
newFixedThreadPool          任务太多会报错 请求队列为max
newSingleThreadExecutor     任务太多会报错
newCacheThreadPool          线程数量太多了会报错 允许创建的线程为max
newScheduledThreadPool      线程数量太多了会报错

还是自己new线程池比较好
*/