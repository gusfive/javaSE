package Q_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class caseMovieShow {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖生客的救赎》",9.7,"robins"));
        movies.add(new Movie("《霸王别姬》",9.6,"张国荣"));
        movies.add(new Movie("《阿甘正传》",9.5,"tom"));
        //1.迭代器
        Iterator<Movie> im = movies.iterator();
        while (im.hasNext()){
            System.out.println(im.next().toString());
        }
        System.out.println("---------------");
        //2.增强for循环
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("-----------------");
        //3.Lambda表达式
        movies.forEach(System.out::println);

    }
}
