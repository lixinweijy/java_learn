package d2_api;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("输出：" + i);
            if(i==3){
                //让线程进入休眠状态
                Thread.sleep(3000);
            }

        }
    }
}
