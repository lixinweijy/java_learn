package d6_regex;
//正则表达式  详情看python笔记
public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("1202032131"));
    }
    public static boolean checkQQ(String QQ){
        return QQ!=null && QQ.matches("\\d{6,20}");
    }
}
