package d5_enum;

public class EnumDemo {
    public static void main(String[] args) {
        Orientation o;
        o=Orientation.UP;
        switch (o) {
            case UP:
                System.out.println("上");
                break;
            case DOWN:
                System.out.println("下");
                break;
            case LEFT:
                System.out.println("左");
                break;
            case RIGHT:
                System.out.println("右");
                break;

        }
    }

}

