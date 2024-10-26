package W_JavaAdvance.ReflectionDemo;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造器执行了");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造器执行了");
    }

    private void run(){
        System.out.println("学生跑的贼快");
    }

    public void eat(){
        System.out.println("爱吃面包");
    }

    private String eat(String name){
        return "爱吃" + name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
