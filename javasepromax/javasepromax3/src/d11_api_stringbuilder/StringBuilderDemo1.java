package d11_api_stringbuilder;
//目标:学会使用stringbuilder来操作字符串，知道其性能好的原因
public class StringBuilderDemo1 {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        sb.append(1);
        sb.append("131");//想怎么拼怎么拼
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder();
        //支持链式编程
        sb1.append("我").append('是').append("sb");
        System.out.println(sb1);

        sb1.reverse();//反转
        System.out.println(sb1.length());

        System.out.println("_______________________________________");
        //注意：StringBuilder只是为了拼接字符串的手段，效率好
        //最终的结果还是恢复成String类型
        StringBuilder sb2=new StringBuilder();
        sb2.append("123").append("456");
        //恢复成String类型
        String rs=sb2.toString();

        check(rs);
        //String做拼接会不断new新的StringBuilder对象  ，因为String是不可变的，每次改变都是不断new新的对象，放弃之前的对象的过程
        rs+="sa";
        System.out.println(rs);
    }
//StringBuilder只是一个拼接字符串的手段，不是目的，最后还是要用String接收
    public static void check(String data){
        System.out.println(data);
    }
}
