package P_AbnormalDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AbnormalDemo {
    public static void main(String[] args) {
        //异常就是代表程序出现的问题
        //Integer.valueOf("abc");
        //异常的体系：Throwable:error
        //                  :exception:RuntimeException:...
        //                              其他异常
        //error:代表系统级别错误（严重问题），系统一旦出现问题，sun公司会把这些问题封装成Error对象给出来，开发人员不太用管这个
        //Exception:异常，代表的是程序可能出现的问题，所以，程序员通常会用Exception以及它的孩子来封装程序出现的问题。
        //          运行时异常：RuntimeException及其子类，编译阶段不会出现错误提醒，运行时出现的异常（如：数组索引越界异常）
        //          编译时异常：编译阶段就会出现错误提醒的。（如日期解析异常）
        m1();
    }

    //解决异常：1.抛出异常（throws）:在方法上使用throws关键字，可以将方法内部出现的异常抛出去给调用者处理。
//    public static void m1() throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date d = sdf.parse("2018-07-09");
//        System.out.println(d);
//    }

    //解决异常：2.捕获异常：直接捕获程序出现的异常（try...catch）
    public static void m1(){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2018-07-09");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("出错了嘻嘻");}
//      catch (){
//
//        }
    }
}
