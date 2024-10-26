package S_IOstream.IOstream;

import java.io.*;

public class printStream {
    public static void main(String[] args) throws Exception {
        //打印流：可以实现更方便、更高效的打印数据出去，能实现打印啥出去就是啥出去,同时自带字符缓冲流
        //printStream
        try(
        //构造器
            PrintStream ps1 = new PrintStream("D:\\test\\printstream.txt");//可以是OutputStream,File,String
            PrintStream ps2 = new PrintStream("D:\\test\\printstream.txt","UTF-8");//String,指定编码
            OutputStream os = new FileOutputStream("D:\\test\\printstream.txt");
            PrintStream ps3 = new PrintStream(os,true);//OutputStream,自动刷新
            PrintStream ps4 = new PrintStream(os,true,"GBK");//OutputStream,自动刷新，指定编码
        ){
            ps4.println(97);//支持打印任何类型的数据，相当于string
            ps4.println('a');
            ps4.println("你好");
            ps4.write(97);//字节独有的方法
        }catch (Exception e){
            e.printStackTrace();
        }

        //printWriter
        try(
                //构造器
                PrintWriter ps1 = new PrintWriter("D:\\test\\printwriter.txt");//可以是OutputStream,File,String,writer
                PrintWriter ps2 = new PrintWriter("D:\\test\\printwriter.txt","UTF-8");//String,指定编码
                OutputStream os = new FileOutputStream("D:\\test\\printwriter.txt");
                PrintWriter ps3 = new PrintWriter(os,true);//OutputStream,自动刷新
//                PrintWriter ps4 = new PrintWriter(os,true,"UTF-8");//OutputStream,自动刷新，指定编码
                ){
            ps3.println(97);//支持打印任何类型的数据，相当于string
            ps3.println('a');
            ps3.println("你好");
            ps3.write(97);//字节独有的方法
        }catch (Exception e){
            e.printStackTrace();
        }

        //区别：printstream继承自字节输出流（OutputStream）,支持字节数据的方法。printWriter继承自字符输出流（Writer）,支持写字符出去
        //打印流的应用：重新定向。
        System.setOut(new PrintStream("D:\\test\\setout.txt"));
        System.out.println("nihao");
    }
}
