package d2_params;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 可变参数的作用：
 *      传输参数非常灵活，方便
 *      可以不传输参数
 *      可以传一个
 *      可以传一堆
 * 可变参数在方法内部是一个数组
 * 注意事项
 *      1.一个形参列表中可变参数只能有一个！！
 *      2.可变参数必须放在形参列表的最后面！！
 *
 */
public class MethodDemo {
    public static void main(String[] args) {
        sun();//不传参数
        sun(10);//传输一个参数
        sun(10,20);//传输两个参数
        sun(new int[]{10,2,3,4,5,});//传输一个数组

    }

    /**
     * 注意：一个形参列表中只能有一个可变参数
     * 可变参数必须放在数组的最后面
     * @param nums
     */
    public static void sun(int ... nums){
        System.out.println("元素个数:"+nums.length);
        System.out.println("元素内容：" + Arrays.toString(nums));

    }
}
