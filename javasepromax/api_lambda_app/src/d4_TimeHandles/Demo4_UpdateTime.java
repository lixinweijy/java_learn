package d4_TimeHandles;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
//LocalDate LocalTime LocalDateTime
public class Demo4_UpdateTime {
    public static void main(String[] args) {
        LocalTime nowTime=LocalTime.now();
        System.out.println(nowTime);//当前时间
        System.out.println(nowTime.minusHours(1)); //一小时前
        System.out.println(nowTime.minusMinutes(1));//一分钟前
        System.out.println(nowTime.minusSeconds(1));//一秒钟前
        System.out.println(nowTime.minusNanos(1));//一纳米前

        System.out.println(nowTime.plusHours(1));//1小时后
        //每次修改产生新的时间对象，原本时间未修改
        System.out.println("---------------------------");
        LocalDate myDate=LocalDate.of(2000,11,10);
        System.out.println("今天是2000年11月10日吗？" + nowTime.equals(myDate));

        LocalDate nowDate=LocalDate.now();
        LocalDate birDate=LocalDate.of(2002,11,10);
        MonthDay birMd=MonthDay.of(birDate.getMonthValue(),birDate.getDayOfMonth());
        MonthDay nowMd=MonthDay.from(nowDate);//直接从nowDate里面取值 月 日
        System.out.println("今天是你的生日吗?" + birMd.equals(nowMd));
    }
}
