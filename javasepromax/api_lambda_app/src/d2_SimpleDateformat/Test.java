package d2_SimpleDateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 秒杀开始:2020年11月11日0:0:0
 * 秒杀结束:2020年11月11日0:10:0
 *
 * lxw下单并付款时间：2020年11月11日0:03:47
 * yt下单并付款时间:2020年11月11日0:10:11
 *
 * 判断是否成功秒杀
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String startTime = "2020年11月11日00:00:00";
        String endTime = "2020年11月11日00:10:00";

        String lxwTime = "2020年11月11日00:03:47";
        String ytTime = "2020年11月11日00:10:11";
        Date sTime = sdf.parse(startTime);
        Date eTime = sdf.parse(endTime);
        Date lTime = sdf.parse(lxwTime);
        Date yTime = sdf.parse(ytTime);
        //method 1
//        if (sTime.getTime() <= lTime.getTime() && lTime.getTime() <= eTime.getTime()) {
//            System.out.println("lxw限时秒杀成功");
//        } else {
//            System.out.println("lxw限时秒杀失败");
//        }
//
//        if (sTime.getTime()<=yTime.getTime() && yTime.getTime()<=eTime.getTime()){
//            System.out.println("yt限时秒杀成功");
//        }else{
//            System.out.println("yt限时秒杀失败");
//        }

        //method 2
        if(lTime.after(sTime) && lTime.before(eTime)){
            System.out.println("lxw成功");
        }else{
            System.out.println("lxw失败");
        }

        if(yTime.after(sTime) && yTime.before(eTime)){
            System.out.println("yt成功");
        }else{
            System.out.println("yt失败");
        }
    }

}
