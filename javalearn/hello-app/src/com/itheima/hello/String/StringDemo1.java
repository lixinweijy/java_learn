package com.itheima.hello.String;

public class StringDemo1 {
    public static void main(String[] args) {
        //public String(char[] c):根据字符数组的内容，来创建字符串对象
        char[] chars={'a','b','中','国'};
        String s1=new String(chars);
        System.out.println(s1);//ab中国

        byte[] bytes={97,98,99,65,66,67};
        String s2=new String(bytes);
        System.out.println(s2);//abcABC

        //双引号创建的字符串对象，在字符串常量池中存储同一个
        //通过new构造器创建的字符串对象，在堆内存中分开存储

        // ==  比较地址，  equals比较内容  equalsIgnoreCase  比较时忽略大小写
    }
}
