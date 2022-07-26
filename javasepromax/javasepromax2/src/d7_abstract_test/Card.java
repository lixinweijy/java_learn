package d7_abstract_test;

public abstract class Card {
    private String name;
    private double money;

    /**
     * 定义一个支付方法，表示卡片可以支付
     * 抽象方法
     */
    public abstract void pay(double money);
    public Card() {
    }

    public Card(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
