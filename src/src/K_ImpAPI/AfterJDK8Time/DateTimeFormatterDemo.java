package K_ImpAPI.AfterJDK8Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        //格式化器，用于时间的格式化、解析，代替SimpleDateFormat(线程不安全)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//获得格式

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(dtf.format(ldt));//对时间对象进行格式化

        System.out.println(ldt.format(dtf));//另一种格式化方法,由LocalDateTime提供

        //解析时间：一般使用LocalDateTime提供的解析方法来解析
        String dataStr = "2077-05-20 00:00:00";
        LocalDateTime ldt1 = LocalDateTime.parse(dataStr,dtf);
        System.out.println(ldt1);

    }
}
