package com.itheima.hello.array;

import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //目标:键盘录入一组工号，最终要随机输出一组出来作为排名
        //1.动态初始化一个数组，存储5个工号
        int[] codes=new int[5];

        //2.定义一个循环，循环5次，依次录入一个工号存入对应的位置
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            //正式录入工号
            System.out.println("请您输入第"+(i+1)+"个员工的工号");
            int code=sc.nextInt();
            //存入到数组中去
            codes[i]=code;
        }

        //3.遍历数组中的每个元素，然后随机生成一个索引，让该元素与随机索引位置的元素值进行交换
        //codes=[12,23,34,45,56]
        Random r=new Random();
        for (int i = 0;i<codes.length; i++) {
            //当前遍历的元素值:codes[i]
            //随机一个索引出来
            int index=r.nextInt(codes.length);

            int temp=codes[index];
            codes[index]=codes[i];
            codes[i]=temp;
        }

        //4.遍历数组元素输出就是随机排名的结果
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+"\t");
        }
    }
}
