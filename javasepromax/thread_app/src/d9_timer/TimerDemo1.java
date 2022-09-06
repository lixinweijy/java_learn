package d9_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//Timer 定时器的使用和了解

//1.Timer 是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入
//2.可能因为其中某个任务的异常使Timer线程死掉，从而影响后续任务执行
public class TimerDemo1 {
    public static void main(String[] args) {
        //1.创建Timer定时器
        Timer timer=new Timer();
        //2.调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行一次~~BBB"+new Date());
            }
        },3000,2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行一次~~AAA"+new Date());
            }
        },3000,2000);
    }
}
