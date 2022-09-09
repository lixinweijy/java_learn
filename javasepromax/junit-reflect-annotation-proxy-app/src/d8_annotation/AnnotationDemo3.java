package d8_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;

public class AnnotationDemo3 {
    @Test
    public void parseClass(){
        //a.首先得到类对象
        Class c=BookStore.class;

        //b.判断这个类上面是否存在这个注解
        if (c.isAnnotationPresent(book.class)){
            //c.直接获取该注解对象
            book book1=(book)c.getDeclaredAnnotation(book.class);
            System.out.println(book1.value());
            System.out.println(book1.price());
        }
    }
}
@book(value = "《java修仙》",price = 99.9,author = {"lxw","yt"})
class BookStore{

    @book(value = "《python修仙》",price = 199.9,author = {"lxw","yt"})
    public void test(){

    }

}