package K_ImpAPI.BigDecimalDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //用于解决浮点型运算时，出现结果失真的问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);//失真

        //BigDecimal bd1 = new BigDecimal(a);//double直接转bigdecimal,不推荐
        BigDecimal a1 = new BigDecimal(Double.toString(a));//string转bigdecimal
        //System.out.println(bd1);
        System.out.println(a1);

        BigDecimal b1 = BigDecimal.valueOf(b);//double转bigdecimal
        BigDecimal c1 = a1.add(b1);//加法
        BigDecimal c2 = a1.subtract(b1);//减法
        BigDecimal c3 = a1.multiply(b1);//乘法
        BigDecimal c4 = a1.divide(b1);//除法
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        BigDecimal i = BigDecimal.valueOf(0.5);
        BigDecimal j = BigDecimal.valueOf(0.9);
        //BigDecimal k = i.divide(j);//报错，无限小数
        BigDecimal k = i.divide(j,10,RoundingMode.HALF_UP);//指定保留位数以及保留模式
        System.out.println(k);

        double s = k.doubleValue();//最后转为double类型
    }
}
