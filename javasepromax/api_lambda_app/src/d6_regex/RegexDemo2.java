package d6_regex;

/**
 * 目标 正则表达式在方法中的应用
 * public String[] split(String regex);
 *      --按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组
 * public String replaceAll(String regex,String newStr)
 *      --按照正则表达式匹配的内容进行替换
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        String names="李新伟123443袁涛13312";
        String[] arg=names.split("\\w+");
        for(int i=0;i<arg.length;i++){
            System.out.println(arg[i]+"\t");
        }

        String names2=names.replaceAll("\\w+"," ");
        System.out.println(names2);
    }
}
