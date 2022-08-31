package d2_recusion;
/*
目标：
啤酒2元一瓶，4个盖子换一瓶，两个空瓶换一瓶
10元喝多少瓶酒，剩余多少空瓶和盖子

答案：15瓶，3盖子，1牌子
 */
public class RecursionDemo2 {
    public static int buyTotalNumber;//瓶子数量
    public static int lastBottleNumber;//瓶子数量
    public static int lastCoverNumber;//盖子数量
    public static void main(String[] args) {
        //1.拿钱买酒
        buy(10);
        System.out.println("啤酒数："+buyTotalNumber);
        System.out.println("盖子数：" + lastCoverNumber);
        System.out.println("瓶子数：" + lastBottleNumber);
    }
    public static void buy(int money){
        //钱可以买的瓶数
        int buyNumber=money/2;
        buyTotalNumber+=buyNumber;

        //瓶盖数
        int coverNumber=lastCoverNumber+buyNumber;
        //瓶子数
        int bottleNumber=lastBottleNumber+buyNumber;
        money=money%2+(coverNumber/4)*2+(bottleNumber/2)*2;

        lastBottleNumber=bottleNumber%2;
        lastCoverNumber=coverNumber%4;
        if (money>=2){
            buy(money);
        }
    }
}
