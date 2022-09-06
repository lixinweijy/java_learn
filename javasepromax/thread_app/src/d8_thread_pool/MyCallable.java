package d8_thread_pool;

import java.util.concurrent.Callable;

//1.定义一个任务类，实现Callable接口，应该申明线程任务执行完毕后的结果的数据类型
public class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n){
        this.n=n;
    }

    /*
    2.重写call方法（任务方法）
     */
    @Override
    public String call() throws Exception {
       int sum=0;
        for (int i = 0; i <=n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+"子线程执行的结果是："+sum;
    }
}
/**
 * 第一种： 编程简单，扩展性弱，不能返回结果
 * 第二种：编程较复杂，扩展性强，不能返回结果
 * 第三种： 编程复杂，扩展性强，能返回结果
 */