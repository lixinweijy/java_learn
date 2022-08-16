package d4_TimeHandles;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo8_Duration {
    public static void main(String[] args) {
        //本地时间日期对象
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);

        //出生的时间日期对象
        LocalDateTime birthday=LocalDateTime.of(2002,12,3,20,12,13);
        System.out.println(birthday);

        Duration duration=Duration.between(birthday,today);//第二个参数减第一个参数
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
