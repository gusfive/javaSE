package Test1;

import java.util.Timer;

public class num3Demo2 {
    public static void main(String[] args) {
        // 创建一个定时器对象
        Timer timer = new Timer() ;
        timer.schedule(new TimeTask(), 0 , 1000);         // 每隔1秒执行一次new TimeTask()里的run方法
    }

}
