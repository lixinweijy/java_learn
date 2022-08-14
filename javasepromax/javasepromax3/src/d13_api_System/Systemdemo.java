package d13_api_System;

import java.util.Arrays;

public class Systemdemo {
    //System功能是通用的，都是直接用类名调用即可，所以System不能被实例化
    /**
     * public static void exit(int status)      终止当前运行的Java虚拟机，非零表示异常终止
     * public static long currentTimeMillis()   返回当前系统的时间毫秒值形式  时间撮
     * public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数) 拷贝数组
     */
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
//        System.exit(0); //JVM终止
        System.out.println(System.currentTimeMillis());

        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,0,11,12,13,14,15};

        System.arraycopy(arr1,2,arr2,3,2);
        System.out.println(Arrays.toString(arr2));  //打印arr2内容

        System.out.println("程序结束。。。");


    }
}

