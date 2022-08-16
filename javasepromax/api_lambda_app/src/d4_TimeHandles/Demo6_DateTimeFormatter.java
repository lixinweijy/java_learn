package d4_TimeHandles;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo6_DateTimeFormatter {
    public static void main(String[] args) {
        //本地此刻  日期时间  对象
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        //解析/格式化器
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        //正向格式化
        System.out.println(dtf.format(ldt));

        //逆向格式化
        System.out.println(ldt.format(dtf));

        //解析字符串时间
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(dtf1);

        //解析当前字符串时间成为本地日期时间对象
        LocalDateTime ldt1=LocalDateTime.parse("2022-08-16 21:30:10",dtf1);
        System.out.println(ldt1);

        System.out.println(ldt1.getDayOfYear());//获取这天是一年中的第几天
    }
}
