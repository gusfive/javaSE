package S_IOstream.IOstream;

import java.io.*;

public class transformationStream {
    public static void main(String[] args) throws Exception {
        //代码编码和被读取的文本文件的编码不一致的情况下，使用字符流读取文本文件时就会出现乱码
        //字符输入转换流：InputStreamReader
        //原理:先获取文件的原始字节流，再将其按真实的字符集编码转成字符输入流，这样字符输入流中的字符就不乱码了。

        try (
                InputStream is = new FileInputStream("D:\\test\\ba.txt");
                //构造器
                Reader isr = new InputStreamReader(is,"GBK");
                BufferedReader br = new BufferedReader(isr);
                ){

        }catch (Exception e){
            e.printStackTrace();
        }

        //控制写出去的字符使用某种字符集编码
        //1.使用getBytes解决 byte[] bytes = data.getBytes("GBK");
        //2.字符输出转换流：OutputStreamWriter
        try (
                OutputStream os = new FileOutputStream("D:\\test\\OutputStreamWriter.txt");
                //构造器
                Writer wr = new OutputStreamWriter(os,"GBK");
                BufferedWriter bw = new BufferedWriter(wr);
        ){

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
