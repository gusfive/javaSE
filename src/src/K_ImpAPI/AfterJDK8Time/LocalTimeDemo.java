package K_ImpAPI.AfterJDK8Time;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        //LocalTime代表本地时间（时、分、秒、纳秒）

        //创建对象
        LocalTime lt = LocalTime.now();
        //获取时间中的信息 getHour getMinute getSecond getNano
        int hour = lt.getHour();

        //修改时间 withHour withMinute withSecond withNano
        LocalTime lt1 = lt.withHour(0);
        System.out.println(lt1);

        //增加某部分 plusHour plusMinutes plusSeconds plusNanos
        LocalTime lt2 = lt.plusHours(1);
        System.out.println(lt2);

        //减少某部分 minusHours minusMinutes minusSeconds minusNanos

        //获取指定时间的LocalTime对象
        LocalTime lt3 = LocalTime.of(0,0,0,1);
        System.out.println(lt3);

        //判断两个时间对象，是否相等，在前还是在后 equals isBefore isAfter
        System.out.println(lt3.equals(lt2));
        System.out.println(lt3.isBefore(lt2));
        System.out.println(lt3.isAfter(lt2));
    }
}
