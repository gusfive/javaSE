package S_IOstream.IOstream;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class IOframe {
    public static void main(String[] args) throws Exception {
        //框架：解决某类问题，编写的一套类、接口等，可以理解成一个半成品，大多框架都是第三方研发的。
        //好处：在框架的基础上开发，可以得到优秀的软件架构，提高开发效率。
        //框架的形式：一般把类、接口等编译成class形式，再压缩成一个.jar结尾的文件发行出去。
        //导入框架的方法：1.下载2.解压找到对应的jar3.粘贴到项目里的lib文件夹4.把lib文件夹add as library

        //IO框架：封装了JAVA提供的对文件、数据进行操作的代码，对外提供了更简单的方式来对文件进行操作，对数据进行读写等。
        //Commons-io:
        //方法
        //复制文件
        FileUtils.copyFile(new File("D:\\test\\ObjectOutputStream.txt"),new File("D:\\test\\IOstreamcopy.txt"));
        //复制文件夹
        FileUtils.copyDirectory(new File("D:\\test"),new File("D:\\testcopy"));
        //删除文件夹
        FileUtils.deleteDirectory(new File("D:\\testcopy"));
        //读取文件
        FileUtils.readFileToString(new File("D:\\test\\ObjectOutputStream.txt"),"UTF-8");


    }
}
