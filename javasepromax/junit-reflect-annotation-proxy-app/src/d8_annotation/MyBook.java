package d8_annotation;

public @interface MyBook {
    String name();
    String[] authors();
    double price();

    //可以加默认值
    int num() default 10;
}
