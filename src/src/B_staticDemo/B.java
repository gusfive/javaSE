package B_staticDemo;

public class B {
    private B(){}
    public static B b = new B();
    public static B getObject(){
        return b;
    }
}
