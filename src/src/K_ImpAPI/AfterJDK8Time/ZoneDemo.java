package K_ImpAPI.AfterJDK8Time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class ZoneDemo {
    public static void main(String[] args) {
        //ZoneId
        ZoneId zi = ZoneId.systemDefault();//获取系统默认的时区
        System.out.println(zi);

        System.out.println(ZoneId.getAvailableZoneIds());//获取java支持的全部时区id

        ZoneId zi1 = ZoneId.of("Asia/Aden");//把某个时区id封装成ZoneId对象

        //ZoneDateTime
        ZonedDateTime zdt = ZonedDateTime.now();//获取系统默认时区的ZonedDateTimie对象
        System.out.println(zdt);
        ZonedDateTime zdt1 = ZonedDateTime.now(zi);//获取某个时区的ZoneDateTime对象
        System.out.println(zdt1);
        ZonedDateTime zdt2 = ZonedDateTime.now(Clock.systemUTC());//获取世界时间钟对象
        System.out.println(zdt2);

        //get with plus minus同LocalDateTime

        //转为Calendar对象(Calendar已被Zone Local取代，一般不用)
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zi));
        System.out.println(instance);
    }
}
