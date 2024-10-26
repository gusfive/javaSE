package C_extendsDemo;

public class B extends A{
    int k;
    public void print3(){
        System.out.println("3");
    }
@Override
    public void print1(){
        System.out.println("666");
    }
    String name = "gs";

    public void printName(){
        System.out.println(this.name);
        System.out.println(name);
        System.out.println(super.name);
    }



}
