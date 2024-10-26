package K_ImpAPI.StringJoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        //StringJoiner在JDK8后才有，也是用来操作字符串的，也可以看成是一个容器，创建之后里面的内容是可变的。
        //好处：不仅可以提高字符串的操作效率，并且在有些场景下使用它操作字符串，代码会更简洁。

        StringJoiner sj1 =new StringJoiner(",");//创建对象，指定拼接时的间隔符号
        StringJoiner sj2 =new StringJoiner(",","[","]");//创建对象，指定拼接时的间隔符号、开始符号、结束符号

        //增
        sj1.add("gus").add("666").add("true");
        System.out.println(sj1);
        sj2.add("gus").add("666").add("true");
        System.out.println(sj2);

        //长度
        System.out.println(sj1.length());

        //返回拼接后的字符串结果
        System.out.println(sj1.toString());
    }
}
