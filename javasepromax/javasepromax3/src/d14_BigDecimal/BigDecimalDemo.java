package d14_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args){
        //浮点型运算的时候直接+ * /可能出现数据失真(精度问题)
        //BigDecimal 用来解决精度问题
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);

        System.out.println("-----------------------");

        double a=0.1;
        double b=0.2;
        double c=a+b;
        System.out.println(c);
        System.out.println("-----------------------");

        //包装浮点型数据成为大数据对象 BigDecimal
        BigDecimal num1= BigDecimal.valueOf(a);
        BigDecimal num2=BigDecimal.valueOf(b);
        BigDecimal sum1=num1.add(num2);//       +
//        BigDecimal sum1=num1.subtract(num2);//  -
//        BigDecimal sum1=num1.multiply(num2);//  *
//        BigDecimal sum1=num1.divide(num2);//    \

        //最后还是要穿给double
        double rs=sum1.doubleValue();
        System.out.println(rs);

        //注意事项: BigDecimal 是一定要精度运算的    但是不能精度运算的数就会出错  比如1/3
        //可以通过给定参数的方法
        BigDecimal a1=BigDecimal.valueOf(1);
        BigDecimal a2=BigDecimal.valueOf(3);
        //参数1：除数    参数2：保留小数位数  参数3：舍入模式
        BigDecimal a3=a1.divide(a2,3, RoundingMode.CEILING);
        System.out.println(a3);
        System.out.println("---------------------");
    }
}
