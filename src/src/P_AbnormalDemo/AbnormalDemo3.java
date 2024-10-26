package P_AbnormalDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AbnormalDemo3 {
    public static void main(String[] args) {
        //开发中对于异常的常见处理方式：1.把异常抛给最外层，最外层捕获异常，记录异常并响应合适的信息给用户
//        try {
//            test1();
//        } catch (FileNotFoundException e) {
//            System.out.println("文件丢失");
//            e.printStackTrace();
//        } catch (ParseException e) {
//            System.out.println("格式错误");
//            e.printStackTrace();
//        }
//    }
//
//    public static void test1() throws FileNotFoundException, ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date d = sdf.parse("2018-07-09");
//        System.out.println(d);
//        test2();
//    }
//
//    public static void test2() throws FileNotFoundException {
//        InputStream is = new FileInputStream("D:/GSnb");
//    }
        try {
            test1();
        } catch (Exception e) {
            System.out.println("有问题");
            e.printStackTrace();
        }
    }

    public static void test1() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2018-07-09 ");
        System.out.println(d);
        test2();
    }

    public static void test2() throws Exception {
        InputStream is = new FileInputStream("D:/GSnb");
    }
}
