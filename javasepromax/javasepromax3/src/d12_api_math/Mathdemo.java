package d12_api_math;

public class Mathdemo {
    //不能实例化，只是一个工具类
    /**
     * public static int abs(int a)             获取参数绝对值
     * public static double ceil(double a)      向上取整
     * public static double floor(double a)     向下取整
     * public static int round(float a)         四舍五入
     * public static int max(int a,int b)       获取两个int值的较大值
     * public static double pow(double a,double b) 放回a的b次幂的值
     * public static double random()            返回值为double的随机值，范围[0.0,1.0)
     */
    public static void main(String[] args){
        System.out.println(Math.abs(-10));
        System.out.println(Math.random());
        //生成3—9之间数
        //(0-1)*6+3
    }
}
