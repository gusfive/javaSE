package H_InnerClassDemo;

public class InnerClassDemo {
    public static void main(String[] args) {
        //内部类是类中的五大成分之一（成员变量、方法、构造器、内部类、代码块），如果一个类定义在另一个类的内部，这个类就是内部类。
        //场景：当一个类的内部，包含了一个完整的事物。且这个事物没有必要单独设计时，就可以把这个事物设计成内部类。

        //成员内部类：类中的一个普通成员，类似之前的普通的成员变量、成员方法。
        Outer.Inner i1 = new Outer().new Inner();
        i1.test();

        //静态内部类:有static修饰的内部类，属于外部类自己独有。
        //静态内部类可以直接访问外部类的静态成员，不可以直接访问外部类的实例成员。
        //静态内部类的创建不需要外部类的实例
        Outer1.Inner1 i2 = new Outer1.Inner1();
        System.out.println(i2.name1);

        //局部内部类：定义在方法、代码块、构造体等执行体中。（go）

        //匿名内部类：一种特殊的局部内部类，程序员不需要为这个类声明名字。
        //特点：匿名内部类本质就是一个子类，并会立即创建出一个子类对象。
        //作用：更方便地创建一个子类对象。可以减少不必要的类声明，使代码更简洁。
        //在开发中的使用场景:通常作为一个参数传输给方法。
        Aniaml a = new Aniaml(){
            @Override
            public void cry() {
                System.out.println("miao");
            }
        };
        a.cry();
    }
    public void go(){
        class A{}
        abstract class B{}
        //interface C{} jdk8不支持
    }
}

abstract class Aniaml{public abstract void cry();}
