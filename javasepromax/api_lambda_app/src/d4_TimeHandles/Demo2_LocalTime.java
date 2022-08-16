package d4_TimeHandles;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo2_LocalTime {
    public static void main(String[] args) {
        //1.获取本地时间对象
        LocalTime nowTime=LocalTime.now();
        System.out.println("今天的时间" + nowTime);

        /**
         * getHour()
         * getMinute()
         * getSecond()
         */

        System.out.println(LocalTime.of(3, 2));
//        System.out.println(LocalDateTime.of(2000, 12, 1, 22, 3, 2, 2));

    }
}
