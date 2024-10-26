package G_interfaceDemo;

public class interfaceDemo {
    public static void main(String[] args) {
        /**接口
         * 关键字：interface，可以定义出一个特殊的结构：接口。
         * 接口不能创建对象；接口是用来被类实现的。实现接口的类称为实现类。
         * 接口的成员变量默认都是public static final修饰的 接口没有构造器 接口里的方法默认为抽象方法，不能有方法体。
         */
        test t1 = new test();
        t1.dm();
        Son s1 = new Son();
        s1.gs();
    }
}

interface A{
    public static final int age = 18;
    public abstract void method();
}

interface B{
    public default void dm(){
        System.out.println("默认方法");
    }
}

interface C{
    static void sm(){
        System.out.println("静态方法");
    }
}
class test implements A,B{
    @Override
    public void method() {
        System.out.println("实现类");
    }
}
//接口的好处
//弥补了类单继承的不足，一个类同时可以实现多个接口。
// 让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现。

/**接口的其他细节
 * jdk8开始，接口中新增的三种办法
 * 1.默认方法：必须用default修饰，默认会被public修饰。是一种实例方法，必须使用实现类的对象来访问。默认方法必须要有方法体。（接口B）
 * 2.私有方法：jdk9开始支持，必须用private修饰。也是实例方法，但是对象也无法访问，只能本类的其他方法访问。
 * 3.静态方法：必须使用static修饰。默认会被public修饰。直接用类名访问。
 * 目的：增强了接口的能力，更便于项目的扩展和维护。
 */

/**接口的多继承
 * 一个接口可以同时继承多个接口。 作用：便于实现类去实现。
 * 接口其他注意事项:
 * 1.一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承。
 * 2.一个类实现多个接口，如果多个接口中存在方法签名冲突，则此时不支持多实现。
 * 3.一个类继承了父类，又同时实现了接口，父类中和接口有同名的默认方法，实现类会优先使用父类的。
 * 4.一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。
 */

interface I {void test1();}
interface J {String test1();}
//interface K extends I,J{}

//class test2 implements I,J{
//    @Override
//    public String test1() {
//        String gs = "gs";
//        return gs;
//    }
//}

interface S {
    default void gs(){
        System.out.println("接口");
    }
}

class Fa {
    public void gs(){
        System.out.println("父类");
    }
}

class Son extends Fa implements S{}