package I_EnumDemo;

public class enumDemo {
    public static final int BOY = 0;
    public static final int GIRL = 1;
    public static void main(String[] args) {
        //枚举是一种特殊类。
        //枚举类的第一行只能罗列一些名称，这些名称都是常量，并且每个常量记住的都是枚举类的一个对象。
        A a1 = A.X;
        System.out.println(a1);

        //枚举类的构造器都是私有的（写不写都只是私有的），枚举类不能对外创建对象。
        //A a = new A();

        //枚举类都是最终类，不可以被继承。
        //枚举类中，从第二行开始，可以定义类的其他各种成员。

        //编译器为枚举类新增了几个方法，并且枚举类都是继承：java.lang.Enum类的，从enum类也会继承到一些方法。
        A[] as = A.values();//拿到全部对象
        A a3 = A.valueOf("Y");
        System.out.println(a3.name());//拿到名字
        System.out.println(a3.ordinal());//拿到索引

        //抽象枚举
        B y = B.Y;
        y.go();

        //枚举的应用场景:硬编码，可读性不好
        check(1);
        //常量
        check(BOY);
        //软编码
        check(Constant.BOY);
        //问题：不受约束，可以输入除了0和1以外的内容

        check2(Constant2.BOY);
    }
    //枚举的应用场景：用来表示一组信息，然后作为参数进行传输。
    //选择定义一个一个的常量来表示一组信息，并作为参数传输
    //参数值不受约束
    //选择定义枚举表示一组信息，并作为参数传输
    //代码可读性好，参数值得到了约束，对使用者更友好，建议使用！
    public static void check(int sex){
        switch (sex) {
            case 0:
                System.out.println("sth man cares about");
                break;
            case 1:
                System.out.println("sth girl cares about");
                break;
        }
    }

    public static void check2(Constant2 sex){
        switch (sex) {
            case BOY:
                System.out.println("sth man cares about");
                break;
            case GIRL:
                System.out.println("sth girl cares about");
                break;

        }
    }
}
