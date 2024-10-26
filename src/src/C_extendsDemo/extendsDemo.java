package C_extendsDemo;

public class extendsDemo {
    public static void main(String[] args) {
        /**关键字：extands,用此关键字可以让一个类和另一个类建立起父子关系。
         * public class B extends A{}
         * A类称为父类（基类/超类）。
         * B类称为子类（派生类）。
         * 特点：子类可以继承父类的非私有成员（成员变量、成员方法）。
         * 继承后对象的创建：子类的对象是由子类、父类共同完成的。
         * 好处：减少重复代码的编写。
         */
        B b = new B();
        b.i = 1;
        b.k = 2;
        b.print1();
        b.print3();

        /**权限修饰符
         * public private protected 缺省
         * 权限修饰符就是用来限制类中的成员（成员变量、成员方法、构造器、代码块。。。）能够被访问的范围。
         * private<缺省<protected<public,本类<同一个包下其他类<任意包下的子类<任意包下的任意类
         * 非子类在创建子类对象后，不能通过子类访问protected修饰的成员。
         */

        //单继承：JAVA是单继承的，JAVA中的类不支持多继承，但是支持多层继承。

        //Object类：object类是java所有类的祖宗类。我们写的任何一个类，其实都是object的子类或子孙类。

        /**方法重写
         * 当子类觉得父类中的某个方法不好用，或者无法满足自己的需求时，子类可以重写一个方法名称、参数列表一样的方法。去覆盖父类的这方法，这就是方法重写。
         * 重写后，方法会遵循就近原则。
         * 注意事项：使用Override注解。子类重写父类方法时，访问权限必须大于或者等于父类该方法的权限。
         * 		   重写的方法返回值类型，必须与被重写方法的返回值类型一样，或者范围更小。
         * 		   私有方法、静态方法不能重写，会报错。
         */
        A a = new A();
        a.print1();
        b.print1();

        /**子类访问其他成员的特点
         * 1.在子类方法中访问其他成员（成员变量、成员方法），是按照就近原则的。
         *  先子类局部找，然后子类成员范围找，然后父类成员范围找 ，没有则报错。
         * 2.如果子父类中出现了重名的成员，会优先使用子类的，如果此时一定要在子类中使用父类，可以使用super.父类变量/父类方法。
         */
        b.printName();

        /**子类构造器的特点
         * 子类的全部构造器，都会先调用父类的构造器，再执行自己。
         * 默认情况下，子类全部构造器的第一行代码都是super（），它会调用父类的无参构造器。
         * 如果父类没有无参数构造器，则我们必须在子类构造器的第一行手写super（……），指定去调用父类的有参数构造器。
         * 任意类的构造器中，都可以通过this（……）去调用该类的其他构造器。
         * 注意事项：this（）、super（）都只能放在构造器的第一行，因此，有了this就不能写super了，反之亦然。
         */
        Child i = new Child(18,"gs","无敌");
        thisdemo t1 = new thisdemo();
        System.out.println(t1.getName());
    }
}
