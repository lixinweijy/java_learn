package d1_stream;
/*
员工信息至少包括：
    名称，性别，工资，奖金，处罚记录
开发一部4个员工，开发二部5个员工
分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象Tooperfomer
分别统计出2个部门的平均月收入，要求去掉最高和最低工资
统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值
 */


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class StreamDemo3 {
    public static double allmoney=0;
    public static double allmoney2=0;
    public static void main(String[] args) {
        List<Employee> one=new ArrayList<>();
        one.add(new Employee("lxw",'男',10000,8000,"摸鱼"));
        one.add(new Employee("yt",'女',20000,200,"顶撞上司"));
        one.add(new Employee("zj",'男',100,50,"工作能力差"));
        one.add(new Employee("zs",'男',20000,18000,null));

        List<Employee> two=new ArrayList<>();
        two.add(new Employee("孙悟空",'男',1000,800,null));
        two.add(new Employee("唐僧",'女',2000,200,"上班吃东西"));
        two.add(new Employee("猪八戒",'男',10,5,"讲小话"));
        two.add(new Employee("沙悟净",'男',2000,1800,null));
        two.add(new Employee("白龙马",'男',5000,4000,null));

        //1.开发一部最高工资
        System.out.println(one.stream().max((s1, s2) -> s1.getBonus() + s1.getSalary() - s2.getBonus() - s2.getSalary()).get());
        Topperformer t=one.stream().max((s1,s2)-> s1.getBonus()+s1.getSalary()- s2.getBonus()-s2.getSalary()).map(e->new Topperformer(e.getName(),e.getSalary()+e.getBonus())).get();
        //
        System.out.println(two.stream().max((s1, s2) -> s1.getBonus() + s1.getSalary() - s2.getBonus() - s2.getSalary()).get());
        Topperformer t1=two.stream().max((s1,s2)-> s1.getBonus()+s1.getSalary()- s2.getBonus()-s2.getSalary()).map(e->new Topperformer(e.getName(),e.getSalary()+e.getBonus())).get();
        //2.去除最高平均工资
        one.stream().sorted(((o1, o2) -> o1.getBonus()+ o1.getSalary()-o2.getSalary()-o2.getBonus())).skip(1).limit(one.size()-2).forEach(e->{
            //求出剩余员工工资总和
            allmoney+=(e.getBonus()+e.getSalary());
        });

        two.stream().sorted(((o1, o2) -> o1.getBonus()+ o1.getSalary()-o2.getSalary()-o2.getBonus())).skip(1).limit(two.size()-2).forEach(e->{
            //求出剩余员工工资总和
            allmoney2+=(e.getBonus()+e.getSalary());
        });

        BigDecimal a=BigDecimal.valueOf(allmoney);//精确
        BigDecimal b=BigDecimal.valueOf(one.size()-2);

        BigDecimal c=BigDecimal.valueOf(allmoney2);//精确
        BigDecimal d=BigDecimal.valueOf(two.size()-2);

        System.out.println("研发一部的平均工资是：" + a.divide(b,2, RoundingMode.HALF_UP));
        System.out.println("研发二部的平均工资是：" + c.divide(d,2,RoundingMode.HALF_UP));
        System.out.println("研发部的平均工资是：" + a.divide(b,2,RoundingMode.HALF_UP).add(c.divide(d,2,RoundingMode.CEILING)).divide(BigDecimal.valueOf(2),2,RoundingMode.HALF_UP));

    }
}
