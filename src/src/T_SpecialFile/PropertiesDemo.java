package T_SpecialFile;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        //properties文件特点：1.只能是键值对 2.键不能重复 3.文件后缀一般是.properties结尾的（不要求必须是此结尾）
        //Properties：一个Map集合（键值对集合），但是我们一般不会当集合使用。
        //            核心作用：代表属性文件，通过其可以读写属性文件里的内容。

        //构造器
        Properties p = new Properties();
        //方法
        p.load(new FileInputStream("javaLearn/src/src/T_SpecialFile/users.properties"));//读取字节流属性文件里的键值对数据
        p.load(new FileReader("javaLearn/src/src/T_SpecialFile/users.properties"));//读取字符流属性文件里的键值对数据
        System.out.println(p.getProperty("gus"));
        Set<String> s = p.stringPropertyNames();//获取全部键,得到一个set集合（keySet）
        for (String s1 : s) {
            System.out.println(s1);
        }
        p.setProperty("wang","1111");//写入键值对数据
        p.store(new FileOutputStream("javaLearn/src/src/T_SpecialFile/users.properties"),"成功1");//把p对象中的键值对数据保存并加上注释
        p.store(new FileWriter("javaLearn/src/src/T_SpecialFile/users.properties"),"成功2");//把p对象中的键值对数据保存并加上注释
    }
}
