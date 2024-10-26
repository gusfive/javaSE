package S_IOstream.FileStream;

import java.io.File;

public class FileTotal {
    public static void main(String[] args) {
        //File是java.io包下的类，File类的对象，用于代表当前操作系统的文件（可以是文件、或文件夹）。
        //注意：File类只能对文件本身进行操作，不能读写文件里面存储的数据。
        //IO流：用于读写数据的（可以读写文件，或网络中的数据）

        //File构造器
//        File(String pathname)  根据文件路径创建文件对象
//        File(String parent,String child)  根据父路径和子路径名字创建文件对象
//        Filr(File parent,String child)  根据父路径对应文件对象和子路径名字创建文件对象

        //1.创建一个File对象，指代某个具体的文件
        File f1 = new File("D:\\test\\ab.txt");
        File f2 = new File("D:/test");
        //路径分隔符
//        File f1 = new File("D:"+File.separator+"test"+File.separator+"ab.txt");
        System.out.println(f1.length());//文件大小
        System.out.println(f2.length());
        //File对象可以指向一个不存在的文件
        File f3 = new File("D:/test1");
        System.out.println(f3.length());
        System.out.println(f3.exists());//判断文件是否存在
        System.out.println(f2.exists());

        //模块下的文件：
        //绝对路径：
//        File f4 = new File("E:\\code\\javaLearn\\src\\src\\gus.txt");
        //相对路径：不带盘符，默认直接去工程下寻找文件
        File f4 = new File("javaLearn\\src\\src\\gus.txt");
        System.out.println(f4.length());
    }
}
