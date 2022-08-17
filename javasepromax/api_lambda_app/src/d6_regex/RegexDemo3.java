package d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 爬虫爬取之后正则匹配
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        String rs="招募大佬带lxw学java，无偿，电话：15807216330" +
                "邮箱：lixinweijy@gmail.com " +
                "qq:2030277353";
        //需求：需要取出电话，邮箱，qq
        //1.定义爬取规则
        String regex="(1[3-9]\\d{9})|(\\w+@\\w{2,20}(\\.\\w{2,20}){1,2}|(\\d{5,10}))";

        //2.把这个规则编译成匹配对象
        Pattern pattern=Pattern.compile(regex);

        //3.得到一个内容匹配器对象
        Matcher matcher=pattern.matcher(rs);

        //4.取出
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
