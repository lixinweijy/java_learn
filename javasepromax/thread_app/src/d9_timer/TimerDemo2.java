package d9_timer;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerDemo2 {
    public static void main(String[] args) {
        //1.创建ScheduleExecutorService线程池，做定时器
        ScheduledExecutorService pool= Executors.newScheduledThreadPool(3);
        //2.开启定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "输出执行AAA"+new Date());
            }
        },0,2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "输出执行BBB"+new Date());
            }
        },0,2, TimeUnit.SECONDS);
    }
}
//并发多线程 并行多进程

/*
线程的生命周期
6中状态

new 新建
                        Blocked锁阻塞
Runnable 可运行          Waiting无限等待
                        Timed Waiting 计时等待
Teminated 被终止

 */