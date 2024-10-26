package K_ImpAPI.AfterJDK8Time;

import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) {
        //时间线上的某个时刻/时间戳，代替Date
        //通过获取instant的对象可以拿到此刻的时间，该时间由两部分组成：从19700101000000开始走到此刻的总秒数+不够一秒的纳秒数
        //作用：可以用来记录代码的执行时间，或用于记录用户操作某个事件的时间点
        //传统的Date对象只能精确到毫秒，并且是可变对象，Instant可以精确到纳秒而且是不可变对象

        Instant ins = Instant.now();//获取当前时间的Instant对象（标准时间）
        System.out.println(ins);

        long sec = ins.getEpochSecond();//获取从1970.。。开始记录到对象时间的秒数
        System.out.println(sec);

        int nano = ins.getNano();//获取不足一秒的纳秒数
        System.out.println(nano);

        //增加/减少 plusMillis plusSeconds plusNanos minus...
        Instant ins1 = ins.plusSeconds(60);
        System.out.println(ins1);

        //判断 equals isBefore isAfter
        System.out.println(ins.equals(ins1));
        System.out.println(ins.isBefore(ins1));
        System.out.println(ins.isAfter(ins1));
    }
}
