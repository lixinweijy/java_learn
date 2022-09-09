package d9_proxy;

public class Star implements Skill{
    private String name;

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name + "开始跳舞，跳的很迷人");
    }

    @Override
    public void sing() {
        System.out.println(name + "开始唱歌，喵喵喵喵喵");
    }
}
