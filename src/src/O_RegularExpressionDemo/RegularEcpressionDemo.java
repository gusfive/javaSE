package O_RegularExpressionDemo;

public class RegularEcpressionDemo {
    public static void main(String[] args) {
        //由一些特定的字符组成的，代表的是一个规则。
        //作用一：用来校验数据格式是否合法
        //作用二：在一段文本中查找满足要求的内容

        //需求：校验QQ号码是否正确，要求全部是数字，长度是（6-20）之间，不能以0开头。
        System.out.println(checkQQ(""));
        System.out.println("--------------");
        System.out.println(checkQQ1("48213207"));

    }

    public static boolean checkQQ(String qq){
        if (qq == null || qq.length() < 6 || qq.length() >20 || qq.startsWith("0")){
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }

    public static boolean checkQQ1(String qq){
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }
}
