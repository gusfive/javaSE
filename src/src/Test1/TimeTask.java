package Test1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

public class TimeTask extends TimerTask {
    // 高考开始时间
    private LocalDateTime st;

    // 构造器，对高考的开始时间进行初始化
    public TimeTask() {
        String s = "2024-06-07 09:00:00";
        // 补全代码
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        st = LocalDateTime.parse(s,dft);
    }

    // 每一秒执行一次该方法
    @Override
    public void run() {
        // 补全代码：完成倒计时效果
        LocalDateTime now = LocalDateTime.now();
        Duration dur =Duration.between(now,st);
        String day = String.valueOf(dur.toDays());
        String hour = String.valueOf(dur.toHours() % 24);
        String minute = String.valueOf(dur.toMinutes() % 60);
        String second = String.valueOf(dur.toMillis() / 1000 % 60);
        System.out.println(day+"天"+hour+"时"+minute+"分"+second+"秒");

    }

}