package L_LambdaDemo;

public class LambdaDemo {
    public static void main(String[] args) {
        //JDK8新增的一种语法形式，用于简化匿名内部类的代码写法
        //格式：（被重写方法的形参列表） ->  {被重写方法的方法体代码}

//        //匿名内部类
//        Animal a = new Animal(){
//            @Override
//            public void run() {
//                System.out.println("狗跑的飞快");
//            }
//        };
//        a.run();

        //注意，lambda表达式并不能简化所有匿名内部类的写法，只能简化函数式接口的匿名内部类
        //函数式接口：有且只有一个抽象方法的接口
        //有@FunctionalInterface的注解的接口必定是函数式接口
        Swimming s1 = () -> {
            System.out.println("狗刨");
        };
        s1.swim();
    }
}

interface Swimming{
    void swim();
}

abstract class Animal{
    public abstract void run();
}