package K_ImpAPI.AfterJDK8Time;

import java.time.*;

public class DurationDemo {
    public static void main(String[] args) {
        //可以用于计算两个时间对象相差的天数、小时数、分数、秒数、纳秒数；只支持LocalDateTime时间格式
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ldt = LocalDateTime.of(2077,5,20,13,14,00,0);
        Duration dur = Duration.between(now,ldt);//构造器

        //计算间隔
        System.out.println(dur.toDays());
        System.out.println(dur.toNanos());
    }
}
