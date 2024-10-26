package O_RegularExpressionDemo;

public class RegexDemo {
    public static void main(String[] args) {
        //String提供了一个匹配正则表达式的方法
        //public boolean matches(String regex)判断字符串是否匹配正则表达式，匹配返回true，不匹配返回false
        //https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html正则表达式API

        //总结：[]：里面的东西出现一次
        //     ^:取反
        //     &&：交集
        //     .：任意字符
        //     \:转义字符
        //     //d:0-9
        //     //D：非0-9
        //     //s:空白字符” “
        //     //S：非空白字符
        //     //w：单词字符[a-zA-Z_0-9]
        //     //W:非单词字符
        //     （）分组 a(bc)+
        //     |：写在括号外面表示并集
        //     ？:表示该字符出现0或1次 //d?
        //     *：0或多次
        //     +：1或多次
        //     {}：具体次数，上下限。\\d{1,99}
        //     (?i):忽略后面字符的大小写
    }
}
