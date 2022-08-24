package d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 80个人，四个景点，选择去哪个景点
 */
public class MapDemo {
    public static void main(String[] args) {
        //1.八十个学生的数据
        String[] selects={"A","B","C","D"};
        Random r=new Random();
//        String datas=new String();
//        for (int i = 0; i < 80; i++) {
//            datas+=selects[r.nextInt(selects.length)];
//        }
        StringBuilder datas=new StringBuilder();
        for (int i = 0; i < 80; i++) {
            datas.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(datas);

        //2.定义一个map集合
        Map<Character,Integer> jd=new HashMap<>();

        //3.遍历八十个学生选择数据
        for (int i = 0; i < datas.length(); i++) {
            //4.提取当前选择景点字符
            if(jd.containsKey(datas.charAt(i))){
                jd.put(datas.charAt(i),jd.get(datas.charAt(i))+1);
            }else{
                //第一次
                jd.put(datas.charAt(i),1);
            }
        }
        //4.输出
        System.out.println(jd);
    }
    /**
     * HashMap 原理和HashSet一样
     *
     */
}
