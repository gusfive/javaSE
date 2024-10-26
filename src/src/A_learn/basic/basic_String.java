package A_learn.basic;

public class basic_String {
    public static void main(String[] args) {
        /**1.String对象的内容不可改变，被称为不可变字符串对象。
         * 每次试图改变字符串对象实际上是新产生了新的字符串对象了，变量每次都指向了新的字符串对象，之前字符串对象的内容确实是没有改变的，因此说String的对象是不可变的。
         *2.只要是以“……”方式写出的字符串对象，会存储到字符串常量池，且相同内容的字符串只存储一份；
         * 但通过new方式创建字符串对象，每new一次都会产生一个新的对象放在堆内存中。
         */
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + 'c';
        System.out.println(s1 == s3);

        //java存在编译优化机制，字符串字面量拼接会直接进行，以提高程序性能。
        //而变量之间的运算实际上是new的过程，在堆内存。直接定义的在常量池，直接套用地址不会重复。
        String s4 = "a" + "b" + "c";
        System.out.println(s1 == s4);
    }


}
