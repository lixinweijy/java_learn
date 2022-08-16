package d4_TimeHandles;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo3_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tm=LocalDateTime.now();
        System.out.println("现在的时间:" + tm);
        LocalTime t=tm.toLocalTime();
        System.out.println("time:" + t);
        LocalDate m=tm.toLocalDate();
        System.out.println("date:" + m);
    }
}
