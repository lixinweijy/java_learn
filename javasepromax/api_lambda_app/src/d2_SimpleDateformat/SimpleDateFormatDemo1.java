package d2_SimpleDateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标：SimpleDateFormat简单日期格式化类的使用
 * 格式化时间
 * 解析时间
 */

public class SimpleDateFormatDemo1 {
    public static void main(String[] args){
        /**
         * y    年
         * M    月
         * d    日
         * H    时
         * m    分
         * s    秒
         */
        //1.日期对象
        Date d=new Date();
        System.out.println(d);

        //2.格式化这个日期对象（指定最终格式化形式）
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a"); //EEE 取星期几 a 去上午还是下午
        // 3.开始格式化日期成为喜欢的字符串形式
        String rs=sdf.format(d);
        System.out.println(rs);

        //4.格式化时间毫秒值
        //需求：请问121秒后的时间是多少
        long time1=System.currentTimeMillis()+121*1000;
        String rs1=sdf.format(time1);
        System.out.println(rs1);

        System.out.println("-------------------解析字符串时间------------------");
    }
}
