package S_IOstream.IOstream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        //文件字节输出流：以内存为基准，把内存中的数据以字节的形式写出到文件中去。

        //构造器
//        OutputStream o1 = new FileOutputStream("D:\\test\\ba.txt");//会覆盖之前的数据
//        OutputStream o2 = new FileOutputStream(new File("D:\\test\\ba.txt"));
        OutputStream o1 = new FileOutputStream("D:\\test\\ba.txt",true);//追加管道，续写文件而不是覆盖文件


        //方法
        o1.write(97);//写入，97代表a
        o1.write('b');//写入字节
//        o1.write('你');//写入字节，但Utf-8三字节，只会保留一个字节
        byte[] bytes = "战略管理".getBytes(StandardCharsets.UTF_8);
        o1.write(bytes);//写入字节数组
        o1.write(bytes,0,6);//写入字节数组的指定范围
        o1.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行符
        o1.close();//关闭

    }
}
