package d1_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
初步体验stream流的方便与快捷

核心：
    1.先得到集合或数组的Stream流（就是一根传送带）
    2.把元素放上去
    3.用这个Stream流简化的API来方便操作元素
 */
/*
Stream流的三类方法：
    获取Stream流：
        1.创建一条流水线，并把数据放在流水线上准备进行操作
    中间方法：
        2.流水线上的操作。一次操作完毕之后，还可以继续进行其他操作
    终结方法：
        3.一个Stream流只能有一个中介方法，是流水线上的最后一个操作
 */
public class SteamTest {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"lxw","yt","zj","lt");
        System.out.println(names);

        //1.从集合中找出l开头的
        List<String > lhead=new ArrayList<>();
        for (String name: names) {
            if(name.startsWith("l")){
                lhead.add(name);
            }
        }
        System.out.println(lhead);
        //2.长度为3
        List<String > lheadthree=new ArrayList<>();
        for (String n: lhead) {
            if(n.length()==3){
                lheadthree.add(n);
            }
        }
        System.out.println(lheadthree);


        //使用stream实现
        names.stream().filter(s -> s.startsWith("l")).filter(s -> s.length()==3).forEach(s-> System.out.println(s));

    }
}
