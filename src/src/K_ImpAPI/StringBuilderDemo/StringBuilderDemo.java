package K_ImpAPI.StringBuilderDemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //StringBuilder代表可变字符串对象，相当于是一个容器，里面改装的字符串是可以改变的，就是用来操作字符串的
        //StringBUilder比String更适合做字符串的修改操作，效率会更高，代码也会更简洁。

         StringBuilder sb1 = new StringBuilder();//空对象
         StringBuilder sb2 = new StringBuilder("gus12138");//有初始字符的对象

        //拼接内容
        sb2.append("nb");
        sb2.append(666);
        sb2.append(true);

        //支持链式编程
        sb2.append("确实").append("牛比");
        System.out.println(sb2);

        //反转字符串
        System.out.println(sb2.reverse());

        //长度
        System.out.println(sb2.length());

        //把stringBuilder类型转换为String类型
        System.out.println(sb2.toString());

        //StringBuffer与StringBuilder一模一样，但BUILDER线程不安全，BUFFER线程安全

    }
}
