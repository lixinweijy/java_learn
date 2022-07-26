package com.itheima.hello.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        //byte字节型  占一个字节  -128~127
        byte number='A';
        System.out.println(number);

        //注意，随便写一个整数字面量默认是int类型的，12221332849302849虽然没有超过long的范围，但是它超过了本身int类型的表示范围。
        //所以希望随便写一个整数字面量当成long类型，需要再其后加l/L
        long lg=12311111111111L;

        //注意：随便需要写一个小数字面量默认是double类型，如果希望随便写一个小数字面量是float类型，需要再其后加上F/f
        float f=11.1F;
    }
}
