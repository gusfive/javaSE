package B_staticDemo;

public class A {
    public static A a = new A();
    private A(){}
    public static A getObject(){
        return a;
    }

}
