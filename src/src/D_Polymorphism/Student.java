package D_Polymorphism;

public class Student extends people{
    public String name = "student";
    @Override
    public void run() {
        System.out.println("学生跑的飞快");
    }

    public void swim(){
        System.out.println("学生游的飞快");
    }
}
