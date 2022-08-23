package d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主：
 *  1.做牌
 *  2.洗牌
 *  3.定义三个玩家
 *  4.发牌
 *  5.排序（拓展，了解，作业）
 *  6.看牌
 *
 */

public class GameDemo {
    /*
     * 1.定义一个静态集合存储54张牌
     */
    public static List<Card> allCards=new ArrayList<>();
    /*
    2.做牌：定义静态代码块初始化牌数据
     */
    static{
        //3.定义点数：个数确定，类型确定，使用数组
        String[] sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //4.定义花色：个数确定，类型确定，使用数组
        String[] colors={"♠","♥","♣","♦"};
        //5.组合点数和花色
        int i=0;
        for(String size:sizes){
            i++;
            for(String color:colors){
                //6.封装成一个牌对象
                Card c=new Card(size,color,i);
                //7.存入到集合容器中去
                allCards.add(c);
            }
        }

        //8.大小王存入到集合对象中去
        allCards.add(new Card("","joker",++i));
        allCards.add(new Card("","JOKER",++i));

    }

    public static void main(String[] args) {
        //9.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);
        //10.定义三个玩家
        List<Card> lxw=new ArrayList<>();
        List<Card> yt=new ArrayList<>();
        List<Card> zj=new ArrayList<>();

        //11.开始发牌
        for (int i = 0; i < allCards.size()-3; i++) {
            if(i%3==0){
                lxw.add(allCards.get(i));
            } else if (i%3==1) {
                yt.add(allCards.get(i));
            }else {
                zj.add(allCards.get(i));
            }
        }
        //12.拿到最后三张牌（截取成一个子集合）
        List<Card> lastTree=allCards.subList(allCards.size()-3,allCards.size());
        //13.牌排序
        sortCard(lxw);
        sortCard(yt);
        sortCard(zj);

        //14.输出玩家的牌
        System.out.println("lxw：" + lxw);
        System.out.println("yt：" + yt);
        System.out.println("zj：" + zj);

        System.out.println("三张底牌：" + lastTree);
    }

    private static void sortCard(List<Card> cards) {
        Collections.sort(cards,(o1, o2) -> o1.getIndex()-o2.getIndex());
    }

}
