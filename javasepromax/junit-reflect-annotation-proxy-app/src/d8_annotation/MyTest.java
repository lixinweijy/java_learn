package d8_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD/*设定为只能注解方法和成员变量*/})//元注解
@Retention(RetentionPolicy.RUNTIME) //一直活着
public @interface MyTest {

}
