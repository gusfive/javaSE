package O_RegularExpressionDemo;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        //作用二：在一段文本中查找满足要求的内容
        method1();
        //作用三：用于搜索替换内容
        method2();
        method3();
        //作用四：用于分割内容，返回一个字符串数组
        method4();
    }

    public static void method1(){
        String data = "你好," +
                "哈哈" +
                "name:gs" +
                "id:48213207" +
                "email:gushang5@foxmail.com";

        //1.定义爬取规则
        String regex = "\\w{5,20}@\\w{2,9}\\.com((\\.cn)?)";
        //2.把正则表达式封装成pattern对象
        Pattern pattern = Pattern.compile(regex);
        //3.通过pattern对象去获取查找内容的匹配器对象
        Matcher matcher = pattern.matcher(data);
        //4.定义一个循环开始爬取信息
        while (matcher.find()){
            String rs = matcher.group();//获取到了找到的内容
            System.out.println(rs);
        }
    }

    public static void method2(){
        String data = "高手在此snakcuhanc天下震惊shaisha十步一人snaksak千里不留";
        System.out.println(data.replaceAll("\\w+", ""));
    }

    public static void method3(){
        String data = "我我我喜欢编编编编编编编编编编编编程程！";
        //(.)捕获组，匹配任意字符的 \\1：为这个组声明一个组号  +：声明必须是重复的字 $1可以取到第1组代表的那个重复的字
        System.out.println(data.replaceAll("(.)\\1+", "$1"));
    }

    public static void method4(){
        String data = "高手在此snakcuhanc天下震惊shaisha十步一人snaksak千里不留";
        System.out.println(Arrays.toString(data.split("\\w+")));
    }
}
