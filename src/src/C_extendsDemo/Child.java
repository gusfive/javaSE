package C_extendsDemo;

public class Child extends Parent{
    private String skill;
    public Child(int age,String name,String skill){
        super(age, name);
        this.skill = skill;
        System.out.println("子类构造器执行");
    }
}
