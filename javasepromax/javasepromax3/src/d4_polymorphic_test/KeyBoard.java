package d4_polymorphic_test;

public class KeyBoard implements USB{
    private String name;

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑~");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "安全拔出~");
    }
    /**
     * 独有功能
     */
    public void keyDown(){
        System.out.println(name + "敲击了");
    }
}
