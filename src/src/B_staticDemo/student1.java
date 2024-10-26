package B_staticDemo;

public class student1 {
    static String name = "wqr";
    double score = 99;

    public static void ph(){
        name = "gs";
        //score = 99.5;
        System.out.println("hello");
        System.out.println(name);
        //System.out.println(score);
    }

    public void ph1(){
        System.out.println(name);
        name = "wqr";
        score = 100;
        System.out.println(score);
        System.out.println(name);

    }
}
