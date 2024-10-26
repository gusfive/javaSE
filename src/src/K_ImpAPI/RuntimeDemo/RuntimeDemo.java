package K_ImpAPI.RuntimeDemo;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        //代表系统所在的运行环境
        //Runtime是一个单例类
        Runtime r = Runtime.getRuntime();

        //r.exit(0);//终止当前的虚拟机
        System.out.println(r.availableProcessors());//返回java虚拟机可用的处理器数
        System.out.println(r.totalMemory()/1024/1024);//返回java虚拟机中的内存总量
        System.out.println(r.freeMemory()/1024/1024);//返回java虚拟机中的可用内存
        Process p = r.exec("D:\\QQ\\QQ.exe");//启动某个程序，并返回代表该程序的对象。
        Thread.sleep(4000);//等待4000ms
        p.destroy();//关闭程序

    }
}
