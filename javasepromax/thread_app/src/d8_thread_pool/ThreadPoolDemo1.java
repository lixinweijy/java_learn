package d8_thread_pool;

import java.util.concurrent.*;

/*
线程池 ExecutorService接口
public ThreadPoolExecutor   线程池实现类

通过线程池处理Runnable任务
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        /*
            public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)
         */
        //1.创建线程池对象
        ExecutorService pool=new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //2.给任务线程池处理
        Runnable target=new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //线程首先核心的三个，再来就放在队列中五个，再来就还能来两个，把五个中的两个挤到最大的线程数中去运行，再多就被拒绝

        //pool.shutdownNow();  //立即关闭，即使有任务没有完成
        pool.shutdown();//等待全部任务执行完毕之后关闭
    }
}

/*
新任务拒绝策略
ThreadPoolExecutor.AbortPolicy          丢弃并抛出异常 默认
                  .DiscardPolicy        丢弃，不抛出异常
                  .DiscardOldestPolicy  抛弃队列中等待最久的异常，把当前任务加入队列
                  .CallerRunsPolicy     绕过线程池直接执行
 */
