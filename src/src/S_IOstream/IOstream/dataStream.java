package S_IOstream.IOstream;

import java.io.*;

public class dataStream {
    public static void main(String[] args) {
        //数据流：
        //DataOutputStream:允许把数据和其类型一并写出去
        try(
                OutputStream o1 = new FileOutputStream("D:\\test\\dataOutputStream.txt");
                //构造器
                DataOutputStream dos = new DataOutputStream(o1);
                ){
            //方法
            dos.writeByte(97);//写入byte类型
            dos.writeInt(97);//写入int类型
            dos.writeDouble(97);//写入double类型
            dos.writeUTF("你好再见");//写入UTF-8类型字符串
            dos.write(97);//写入byte类型
            dos.write(new byte[]{5,97,98},1,2);//写入byte数组或者其中部分
        }catch (Exception e){
            e.printStackTrace();
        }

        //DataInputStream(数据输入流):用于读取数据输出流写进去的数据
        try(
                //构造器
                DataInputStream dis = new DataInputStream(new FileInputStream("D:\\test\\dataOutputStream.txt"));
                ){
            //方法
            System.out.println(dis.readByte());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            System.out.println(dis.read(new byte[3]));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
