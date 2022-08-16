package d4_TimeHandles;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Demo5_Instant {
    public static void main(String[] args) {
        //1.得到一个Instant时间撮对象
        Instant instant=Instant.now();
        System.out.println(instant);//格林尼治时间

        //2.系统此刻的时间撮
        Instant instant1=Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));//设置时区的时间

        //3.如何去返回Date对象
        Date date=Date.from(instant);
        System.out.println(date);

        //4.返回时间撮对象
        Instant i2=date.toInstant();
        System.out.println(i2);
    }
}
