package A_learn.basic;

public class basic_oop {
    public static void main(String[] args) {
        /**快速入门
         * 开发一个一个的对象，把数据交给对象，再调用对象的方法来完成对数据的处理。
         */

        //开发对象：见basic_oop_student类
        //调用对象：
        basic_oop_student S1 = new basic_oop_student();
        S1.name = "wqr";
        S1.chinese = 59;
        S1.math = 61;
        S1.printTotalScore();
        S1.printAverageScore();

        basic_oop_student S2 = new basic_oop_student();
        S2.name = "gs";
        S2.chinese = 100;
        S2.math = 100;
        S2.printTotalScore();
        S2.printAverageScore();

        /**深刻理解
         * 对象：本质上是一种特殊的数据结构。
         * class也就是类，也称为对象的设计图（或者对象的模板）。
         */

        /**对象在计算机中的执行原理
         * class进入方法区包括形参和方法，main进入栈内存，main下创建变量s1，s2
         * new 出来的对象在堆内存，包括对象数据以及对应class的地址（对象里定义的方法）
         * 例如对象以及数组等，变量中存储的都是对象的地址，都算是引用类型的变量。
         */

        /**类和对象的一些注意事项
         * 1.类名建议用英文单词，首字母大写，满足驼峰模式，且要有意义。
         * 2.类中定义的变量也称为成员变量（对象的属性），类中定义的方法也称为成员方法（对象的行为）。
         * 3.成员变量本身存在默认值，定义成员变量时一般来说不需要赋初始值（没有意义）。
         * 4.一个代码文件中，可以写多个class类，但是只能用一个public修饰，且public修饰的类名必须成为代码文件名。
         * 5.对象与对象之间的数据不会相互影响，但多个变量指向同一个对象时就会相互影响了。
         * 6.如果某个对象没有一个变量引用它，则该对象无法被操作，该对象会成为所谓的垃圾对象。
         * JAVA存在内存回收机制会自动清楚垃圾对象
         */

        /**this
         * this为一个变量，可以用在方法中，来拿到当前对象。
         * this主要用来解决变量名称冲突问题
         */

        /**构造器(详情见student1类)
         * 名称与类名一致，无返回变量
         * Student s1=new **Student()**;该部分即为调用方法里的哪个构造器
         * 构造器常用于完成对象的初始化（常见应用场景是完成对象的成员变量的初始化赋值）
         * 类在设计时，如果不写构造器，Java会为类自动生成一个无参数构造器；
         * 一旦定义了有参数的构造器，Java就不会再自动生成无参数构造器；建议手写一个无参数构造器。
         */
        student1 s1 = new student1("wqr",59);

        /**封装（详情见student2类）
         * 定义：用类设计对象处理某一个事物的数据时，应该把要处理的数据，以及处理这些数据的方法，设计到一个对象中去。
         * 设计规范：合理隐藏，合理暴露。
         * 面向对象的三大特征：封装、继承、多态。
         * 公开成员使用public修饰，隐藏成员用private修饰。public外界可以调用，private不能。
         */
        student2 s2 = new student2();
        s2.setScore(59);
        System.out.println(s2.getScore());

        /**实体类JAVABean（详情见student3以及student3operator类）
         * 定义：一种特殊的类。
         * 1.这个类中的成员变量都要私有，并且要对外提供相应的getXxx,setXxx方法。
         * 2.类中必须要有一个公共的无参的构造器。
         * 实体类只负责数据存取，而对数据的处理交给其他类来完成，以实现数据和数据业务的分离。
         */
        student3 s3 = new student3(100,100);
        student3operator s3o = new student3operator();
        System.out.println(s3o.averagescore(s3));

        /**成员变量与局部变量的区别
         *             成员                 局部
         * 类中位置  类中 方法外              方法中
         * 初始化值  有默认值 不需要初始化      没有默认值，必须初始化
         * 内存位置  堆内存                   栈内存
         * 作用域    整个对象                 在所属的大括号中
         * 生命周期   与对象共存亡             方法调用而生，方法结束而亡
         */
    }
}
