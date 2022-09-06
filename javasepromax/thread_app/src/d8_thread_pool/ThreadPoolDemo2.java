package d8_thread_pool;

import java.util.concurrent.*;

/*
通过线程池处理Callable任务
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) throws Exception{
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
        Future<String> f1=pool.submit(new MyCallable(100));
        Future<String> f2=pool.submit(new MyCallable(200));
        Future<String> f3=pool.submit(new MyCallable(300));
        Future<String> f4=pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}

/*
新任务拒绝策略
ThreadPoolExecutor.AbortPolicy          丢弃并抛出异常 默认
                  .DiscardPolicy        丢弃，不抛出异常
                  .DiscardOldestPolicy  抛弃队列中等待最久的异常，把当前任务加入队列
                  .CallerRunsPolicy     绕过线程池直接执行
 */
