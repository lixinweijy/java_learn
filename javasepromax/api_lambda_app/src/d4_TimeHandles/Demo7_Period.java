package d4_TimeHandles;

import java.time.LocalDate;
import java.time.Period;
//用来测算两天之间的时间间隔
public class Demo7_Period {
    public static void main(String[] args) {
        //当前本地 年月日
        LocalDate today=LocalDate.now();
        System.out.println(today);

        //生日的 年月日
        LocalDate birthday=LocalDate.of(2002,12,3);
        System.out.println(birthday);

        Period period=Period.between(birthday,today);   //从生日到今天的间隔

        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }
}
