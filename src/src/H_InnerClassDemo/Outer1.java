package H_InnerClassDemo;

public class Outer1 {
    int age = 18;
    static String name = "gs";
    public static class Inner1{
        //int age = Outer.age + 1;
        String name1 = Outer.name + "nb";
    }
}
