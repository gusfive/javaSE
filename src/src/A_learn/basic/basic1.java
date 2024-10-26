package A_learn.basic;

public class basic1 {
    public static void main(String[] args) {
        /**自动转换
         * byte-short-int-long-float-double
         * char-int
         */
        byte a = 20;
        int b = a;
        char ch = 'a';
        int c = ch;
        System.out.println(c);

        /**表达式的自动转换
         * byte short char -int
         */
        byte a1 = 30;
        byte a2 = 20;
        int a3 = a1 + a2;

        /**强制类型转换
         * 去二进制对应的后面位数，浮点转为整形则不要小数部分
         */
        int a4 = 128;
        byte b1 = (byte)a4;
        System.out.println(b1);
        double c1 = 15.33;
        int a5 = (int)c1;
        System.out.println(a5);

        /**运算符
         *  %：两个整数相除的结果还是整数
         *  +：连接符，连接字符串，从前到后顺序能运算则运算，否则便是连接符
         *  自增、自减：++ -- 只能操作变量，不能操作字面量。
         *           单独使用，a++与++a没区别，否则++a先加再使用变量，a++先使用再加。
         *  赋值运算符：a += b,自带强制类型转换
         *  关系运算符：== ！= < <= > >=
         *  逻辑运算符：&:且 &&：短路且  |：或   ||：短路或   ！：非   ^：异或（前后不一致则为true）
         *  三元运算符：条件表达式?值1：值2；
         *  运算符优先级：最高：（），乘除 大于 加减，&&高于||
         */
        double c2 = 4/3;
        System.out.println(c2);
        System.out.println('a'+12);
        System.out.println("ab"+12);
        int a6 = 3;
        double b6 = 2.5;
        System.out.println(a6 += b6);
        System.out.println(1==2 ^ 2==2);
        String consequence= 59 >= 60 ? "及格" : "不及格";
        System.out.println(consequence);

    }
}
