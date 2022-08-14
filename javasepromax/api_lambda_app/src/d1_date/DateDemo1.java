package d1_date;

import java.util.Date;

/**
 * 目标：学会使用Date类处理时间，获取时间的信息
 */
public class DateDemo1 {
    public static void main(String[] args){
        //1.创建一个Date类的对象，代表系统此刻日期时间对象
        Date d=new Date();
        System.out.println(d);

        //2.获取当前时间的毫秒值
        long time =d.getTime();
        System.out.println(time);

//        long time1=System.currentTimeMillis();
//        System.out.println(time1);
        //3.把时间毫秒值转化为Date日期对象
        //Date d=new Date(time);    1
        //d.setTime(time);          2
        System.out.println("---------------------");

        //1.得到当前时间毫秒值
        long time1=System.currentTimeMillis();
        Date d1=new Date(time1);
        System.out.println(d1);

        time1+=(60*60+121)*1000;
        Date d2=new Date(time1);
        System.out.println(d2);
    }

}
