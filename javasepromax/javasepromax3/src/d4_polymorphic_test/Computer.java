package d4_polymorphic_test;

public class Computer {
    private String name;

    /**
     * 提供安装USB设备的入口
     */
    public void installUSB(USB a){
        //多态：usb ==可能是鼠标，也可能是键盘
        a.connect();

        //独有功能，先判断再强转
        if(a instanceof KeyBoard){
            KeyBoard k=(KeyBoard) a;
            k.keyDown();
        }else if(a instanceof Mouse){
            Mouse m=(Mouse) a;
            m.dbClick();
        }
        a.unconnect();

    }
    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
