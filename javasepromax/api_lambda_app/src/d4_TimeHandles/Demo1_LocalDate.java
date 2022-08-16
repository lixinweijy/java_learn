package d4_TimeHandles;

import java.time.LocalDate;
import java.time.Month;

public class Demo1_LocalDate {
    public static void main(String[] args) {
        //1.获取本地日期对象
        LocalDate nowDate=LocalDate.now();
        System.out.println("今天的日期:"+nowDate);//今天的日期

        int year=nowDate.getYear();
        System.out.println("year:" + year);

        int month=nowDate.getDayOfMonth();
        System.out.println("month:" + month);

        //当年第几天
        int dayOfYear=nowDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayOfYear);

        //星期
        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfWeek().getValue());

        //月份
        System.out.println(nowDate.getMonth());
        System.out.println(nowDate.getMonth().getValue());
        System.out.println("--------------------------");

        LocalDate bt=LocalDate.of(2000,1,1);
        System.out.println(bt);//直接传入对应的年月日
        System.out.println(LocalDate.of(2000, Month.JANUARY, 1));//相对上面
    }
}
