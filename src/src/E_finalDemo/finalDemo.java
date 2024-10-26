package E_finalDemo;

public class finalDemo {
    public static void main(String[] args) {
        //final关键字是最终的意思，可以修饰（类、方法、变量）

        //修饰类：该类被称为最终类，特点是不能被继承。

        //修饰方法：该方法被称为最终方法，特点是不能被重写了。

        //修饰变量：该变量只能被赋值一次。

        //final修饰基本类型的变量，变量存储的数据不能被改变。
        final int age = 18;
        //age++;

        //final修饰引用类型的变量，变量存储的地址不能被改变，但是地址所指向的内容是可以被改变的。
        final int[] arr1 = {1,2,3};
        System.out.println(arr1);
        arr1[1] = 0;
        System.out.println(arr1);
        //arr1 = new int[3];

        /**常量
         * 使用了static final修饰的成员变量就被称为常量；
         * 作用:通常用于记录系统的配置信息。
         * 常量的命名规范：建议使用大写英文单词，多个单词使用下划线连接起来。
         * 使用常量记录系统配置信息的优势、执行原理：代码可读性更好，可维护性也更好。
         *                                  程序编译后，常量会被”宏替换“：出现常量的地方全部会被替换成其记住的字面量，这样可以保证使用常量和直接使用字面量的性能是一样的。
         */
        //在Java的main方法中，你不能声明一个变量为public或static。这是因为main方法是一个实例方法的上下文，而public和static修饰符是用于类级别的成员。
        System.out.println(C.NAME);
    }

}
