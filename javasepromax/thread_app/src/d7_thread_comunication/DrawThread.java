package d7_thread_comunication;

public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc=acc;
    }

    @Override
    public void run() {
        //小明和小红都去acc账户取钱

        while (true) {
            acc.drawMoney(100000);
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
