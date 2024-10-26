package S_IOstream.IOstream;

public class resourceRelease {
    public static void main(String[] args) {
        //  如果流中报错，close关闭流失效，浪费内存性能
        //try-catch-finally:必定执行finally区，除非JVM终止。一般用于在程序执行完成后进行资源的释放操作（专业级做法）。
        try {
            System.out.println(10 / 2);
//            return;
//            System.exit(0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("run");
        }

        System.out.println(divide(5, 2));

//        try-catch-finally代码比较臃肿，从JDK7开始，更简单的资源释放方案：try-with-resource

//        try(定义资源1；定义资源2；。。。){
//        可能出现异常的代码；
//        }catch(异常名 变量名){
//        异常处理代码；
//        }

//        原理：该资源使用完毕后，会自动调用其close()方法，完成对资源的释放！

//        注意事项：try后面的小括号只能放置资源对象(流对象),不能放置变量等。资源对象都有autocloseable接口。用完后会自动调用close方法完成资源的释放。
    }

    public static int divide(int a,int b){
        try {
            return a / b;
        }catch (Exception e){
            e.printStackTrace();
            return -1;//代表出现异常，同时给方法一个返回值
        }finally {
            //由于finally优先级很高，如果在finally中返回方法类型的值，会导致返回值被覆盖
            return 4821;
        }
    }
}
