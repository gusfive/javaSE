package S_IOstream.IOstream;

import java.io.*;

public class charStream {
    public static <fw1> void main(String[] args) throws IOException {
        //FileReader文件字符输入流：以内存为基准，可以把文件中的数据以字符的形式读入到内存中去。
        //构造器
        try(
        Reader fr = new FileReader("D:\\test\\ba.txt");
//        FileReader fr1 = new FileReader(new File("D:\\test\\ba.txt"));
        ) {
            //方法
//            int c;
//            while ((c = fr.read()) != -1){//每次读取一个字符返回，如果没有发现数据可读会返回-1。
//                System.out.println((char)c);
//            }
            System.out.println("===========");
            char[] buffer = new char[10];
            int len;
            while ((len = fr.read(buffer)) != -1){//每次用一个字符数组去读取数据，返回字符数组读取了多少个字符，如果发现没有数据可读会返回-1.
                System.out.println(new String(buffer,0,len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //FileWriter:文件字符输出流，以内存为基准，把内存中的数据以字符的形式写出到文件中去。
        try(
                //构造器
                Writer fw = new FileWriter("D:\\test\\filewriter.txt");//直接覆写
                Writer fw1 = new FileWriter("D:\\test\\filewriter.txt",true);//拼接
//                FileWriter fw1 = new FileWriter(new File("D:\\test\\filewriter1.txt"))
                ){
            //方法
            fw.write(98);//写入字符
            fw.write("你好");//写入字符串
            fw.write("\r\n");//换行符
            fw.write("gs心无旁骛",1,4);//写入字符串的起止内容
            fw.write(new char[]{'a','b','c'},0,2);//写入字符数组的起止内容
            //注意事项：字符输出流写出数据后，必须刷新流，或者关闭流，写出去的数据才生效。（字符先进入缓冲区，再一次写入.如果缓冲区满了则会自动写入磁盘文件，即强制刷新）
//            fw.flush();//刷新流
//            fw.close();//关闭流，包含刷新操作
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
