package K_ImpAPI.AfterJDK8Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        //LocalDateTime代表本地日期、时间（年、月、日、星期、时、分、秒、纳秒）

        //创建对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //其余部分包含LocalDate和LocalTime的所有功能

        //可以把LocalDateTime转换成LocalDate和LocalTime
        LocalDate ld = ldt.toLocalDate();
        System.out.println(ld);
        LocalTime lt = ldt.toLocalTime();
        System.out.println(lt);

        //可以把LocalDate LocalTime组合成LocalDateTime格式
        LocalDateTime ldt1 = LocalDateTime.of(ld,lt);
        System.out.println(ldt1);
    }


}
