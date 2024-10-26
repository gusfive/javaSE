package S_IOstream.IOstream;

import java.io.*;

public class FileputStreamDemo {
    public static void main(String[] args) throws IOException {
        //文件字节输入流：以内存为基准，来自磁盘文件/网络中的数据以字节的形式读入到内存中去的流

        //构造器
        InputStream fis1 = new FileInputStream(new File("D:\\code\\gustest.txt"));
        InputStream fis2 = new FileInputStream("D:\\code\\gustest.txt");

        //方法
//        System.out.println(fis2.read());//每次读取一个字节返回，如果没有数据了，返回-1
//        System.out.println(fis2.read());
        int a;
        while ((a = fis2.read()) != -1){
            System.out.print((char)a);
        }
        fis2.close();
        //读取的性能很差，且读取汉字输出会乱码！！无法避免的。除此以外，流使用完后必须关闭以释放系统资源

        System.out.println(" ");
        System.out.println("----------");
//        byte[] buffer = new byte[2];
//        int len = fis1.read(buffer);//每次读取多个字节到字节数组中去，返回读取的字节数量，读取完毕会返回-1
//        String rs = new String(buffer);
//        System.out.println(rs);
//        System.out.println(len);
//        //如果最后一组字节不满足字节数，则buffer的最后位数保留上一组的
//        String rs1 = new String(buffer,0,len);//读取多少，写出多少。

        byte[] buffer =new byte[3];
        int len;
        while ((len = fis1.read(buffer)) != -1){
            String rs = new String(buffer,0,len);
            System.out.print(rs);
        }
        fis1.close();
        //性能明显提升，但是仍然不能避免读取汉字乱码，

        //解决乱码问题：1.定义一个字节数组和被读取的文件大小一样大，然后使用该字节数组，一次读完文件的全部字节
        //            2.使用public byte[] readAllBytes() throws IOException,直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回
        //InputStream is = new FileInputStream("D:\\code\\gustest.txt");
        //byte[] buffer1 = is.readAllBytes();//JDK9以上才支持
        //如果文件过大，创建的字节数组也过大，可能引起内存溢出
    }
}
