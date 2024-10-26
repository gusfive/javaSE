package L_LambdaDemo;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        //Lambda表达式的省略写法
        double[] prices = {99.8,128,100};
        //Arrays.setAll(prices,(int value) -> {return prices[value] * 0.8;});

        //参数类型可以省略不写
        //Arrays.setAll(prices,(value) -> {return prices[value] * 0.8;});

        //如果只有一个参数，参数类型可以省略，同时（）也可以省略
        //Arrays.setAll(prices,value -> {return prices[value] * 0.8;});

        //如果Lambda表达式中的方法体代码只有一行代码，可以省略大括号不写，同时也要省略分号！此时，如果这行代码是return语句，也必须去掉return不写
        Arrays.setAll(prices,value -> prices[value] * 0.8);

        System.out.println(Arrays.toString(prices));

    }
}
