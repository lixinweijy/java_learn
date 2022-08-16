package d4_TimeHandles;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Demo9_CHronoUnit {
    public static void main(String[] args) {
        //本地日期时间对象 此刻的
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);

        //生日时间
        LocalDateTime birthday=LocalDateTime.of(2002,12,3,1,1,1);
        System.out.println(birthday);

        System.out.println("相差的年数"+ ChronoUnit.YEARS.between(birthday,today));
        System.out.println("相差的月数" + ChronoUnit.MONTHS.between(birthday, today));
        /**
         * 周，天，时，半天，世纪，千年，纳秒
         */

    }
}
