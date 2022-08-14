package d3_Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * 抽象类
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //1.拿到系统此刻日历对象
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);

        //2.获取日历的信息：public int get(int field):取日期中的某个字段信息
        int year=cal.get(Calendar.YEAR);
        System.out.println(year);
        int mouth=cal.get(Calendar.MONTH)+1;
        System.out.println(mouth);

        //3.public void set(int field,int value)：修改日历中的某个字段信息
        cal.set(Calendar.HOUR,12);
        System.out.println(cal);

        //4.public void add(int field,int amount)：为某个字段增加/减少指定的值
        //请问64天之后是什么时间？
        cal.add(Calendar.DAY_OF_YEAR,64);

        //5.public final Date getTime():    拿到此刻的日期对象
        Date t=cal.getTime();
        System.out.println(t);

        //6.public long getTimeInMillis()：拿到此刻的时间毫秒值
        long time=cal.getTimeInMillis();
        System.out.println(time);
    }
}
