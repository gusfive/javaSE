package S_IOstream.FileStream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileMethod {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\test\\ab.txt");
        File f2 = new File("D:\\test");
        File f3 = new File("D:\\Test1.txt");
        File f4 = new File("D:\\Test1");
        File f5 = new File("D:\\Test1\\test2\\test3\\test4");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(f1.exists());//该路径文件是否存在
        System.out.println(f1.isFile());//该文件是否是文件
        System.out.println(f2.isDirectory());//该文件是否是文件夹
        System.out.println(f1.getName());//获取文件名称(包括后缀)
        System.out.println(f1.length());//获取文件大小，返回字节个数
        System.out.println(sdf.format(f1.lastModified()));//获取文件的最后修改时间
        System.out.println(f1.getPath());//获取创建文件对象时，使用的路径
        System.out.println(f1.getAbsolutePath());//获取文件的绝对路径
        System.out.println(f3.createNewFile());//创建文件,返回创建是否成功
        System.out.println(f4.mkdir());//创建文件夹，注意只能创建一级文件夹
        System.out.println(f5.mkdirs());//创建文件夹，可以创建多级文件夹
        System.out.println(f5.delete());//删除文件或者空文件夹，注意不能删除非空文件夹(删除后的文件不会进入回收站)

        //public String[] list():获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回
        File f6 = new File("D:\\Test1");
        String[] test1 = f6.list();
        for (String s : test1) {
            System.out.println(s);
        }
        //public File[] listFiles():获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回
        //注意事项：当主调是文件，或者路径不存在时，返回null
        //        当主调是空文件夹时，返回一个长度为0的数组
        //        当主调是非空文件夹时，将里面所有一级文件和文件夹的路径放在File数组中返回
        //        当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组返回，包含隐藏文件
        //        当主调是一个文件夹，但是没有权限访问该文件夹时，返回null
        File f7 = new File("D:\\Test1\\test2\\test3");
        for (File file : f7.listFiles()) {
            System.out.println(file.getName());
        }

    }
}
