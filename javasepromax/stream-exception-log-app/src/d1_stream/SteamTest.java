package d1_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
初步体验stream流的方便与快捷
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
