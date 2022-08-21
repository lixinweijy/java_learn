package d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {

    public static void main(String[] args) {
        //1.定义一个电影类
        //2.定义一个集合对象存储3部电影对象
        Collection<Movie> movies=new ArrayList<>();
        movies.add(new Movie("《啦啦啦》",9.5,"lxw"));
        movies.add(new Movie("《哈哈哈》",9.4,"yt"));
        movies.add(new Movie("《噢噢噢》",9.3,"zj"));

        //3.遍历集合容器中的每个电影对象
        for(Movie movie:movies){
            System.out.print("片名:" + movie.getName()+"\t");
            System.out.print("得分:" + movie.getScore()+"\t\t");
            System.out.println("主演:" + movie.getActor());
        }
    }

}
