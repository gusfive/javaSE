package D_Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        /**多态是在继承/实现情况下的一种现象，表现为：对象多态、行为多态。
         多态的前提:有继承/实现关系；存在父类引用子类对象；存在方法重写。
         注意事项：多态是对象、行为的多态，JAVA中的属性（成员变量）不谈多态.
         成员变量的选择是根据引用变量的类型来的。
         */
        people p1 = new people();
        people s1 = new Student();
        //Student p2 = new people();
        Student s2 = new Student();
        p1.run();
        s1.run();
        System.out.println(p1.name);
        System.out.println(s1.name);
        System.out.println(s2.name);

        /**使用多态的好处
         * 在多态形式下，右边对象是解耦合的，更便于扩展和维护。
         * 定义方法时，使用父类类型的形参，可以接收一切子类对象，扩展性更强更便利。
         */

        //多态下的问题:多态下不能使用子类的独有功能。
        //s1.swim;

        /**多态下的类型转换问题
         * 自动类型转换：父类 变量名= new 子类（）；
         * 强制类型转换：子类 变量名=（子类）父类变量；
         */
        Student s3 = (Student) s1;
        s3.swim();

        /**强制类型转换注意事项：
         存在继承/实现关系就可以在编译阶段进行强制类型转换，编译阶段不会报错。
         运行时，如果发现对象的真实类型与强转后的类型不同，就会报类型转换异常（ClassCastException）的错误出来。
         */
//        Teacher t1 = (Teacher) p1;
//        t1.run();

        //强转前，JAVA建议：使用instanceof关键字，判断当前对象的真实类型，再进行强转。
        if (s1 instanceof Student){
            Student s4 = (Student) s1;
            s4.run();
        }else {
            Teacher t2 = (Teacher) s1;
            t2.run();
        }
    }
}
