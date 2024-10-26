package S_IOstream.IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializationStream {
    public static void main(String[] args) {
        //对象序列化：把JAVA对象写入到文件中去
        //对象反序列化：把文件中的JAVA对象读出来
        //ObjectOutputStream:对象字节输出流，可以把java对象序列化
        try(
                //构造器
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\test\\ObjectOutputStream.txt"));
                ){
            //方法
            User u = new User("admin","gus",18,"123456");
            oos.writeObject(u);//把对象写出去(该对象必须实现Serializable接口)
        }catch (Exception e){
            e.printStackTrace();
        }

        //ObjectInputStream:对象字节输入流：可以把JAVA对象反序列化
        try(
                //构造器
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\test\\ObjectOutputStream.txt"));
                ){
            //方法
            User u1 = (User) ois.readObject();
            System.out.println(u1);
            //注意事项:对象的成员变量如果用transient修饰，则表示该变量不参与序列化
            //注意事项:如果想要一次序列化多个对象，可以用一个ArrayList集合存储多个对象，然后直接对集合进行序列化即可，ArrayList已经实现了序列化接口
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
