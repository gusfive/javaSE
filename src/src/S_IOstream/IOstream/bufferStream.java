package S_IOstream.IOstream;

import java.io.*;

public class bufferStream {
    public static void main(String[] args) {
        //缓冲流/包装流 ：对原始流/低级流进行包装，以提高原始流读写数据的性能
        //FileInputStream:BufferedInputStream字节缓冲输入流
        //FileOutoutStream:BufferedOutputStream字节缓冲输出流
        //FileReader:BufferedReader字符缓冲输入流
        //FileWriter:BufferedWriter字符缓冲输出流

        //原理：缓冲流自带了8KB缓冲池。
        try(
               //构造器
               //字节输入流(可以调节缓冲池大小)
               InputStream b1 = new BufferedInputStream(new FileInputStream("D:\\test\\ba.txt"),8192 * 2);
               //字节输出流
               OutputStream b2 = new BufferedOutputStream(new FileOutputStream("D:\\test\\BufferedOutputStream.txt"),8192 * 2);
               //字符输入流
               BufferedReader br = new BufferedReader(new FileReader("D:\\test\\ba.txt"));
               //字符输出流
               BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\test\\BufferedWriter.txt"));
                ){
            System.out.println(br.readLine());//读取一行的数据并返回，没有则返回null（换行符导致的空行也算有内容）
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            bw.newLine();//换行,等同于bw.write("\t\n");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
