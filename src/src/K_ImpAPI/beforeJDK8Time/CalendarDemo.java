package K_ImpAPI.beforeJDK8Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
       //代表的是系统此刻时间对应的日历
       //通过calendar可以单独获取、修改时间中的年、月、日、时、分、秒等
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1);

        System.out.println(c1.get(Calendar.YEAR));//get（int）获取日历中的某个信息

        Date d1 = c1.getTime();//获取Date对象
        long l1 = c1.getTimeInMillis();//获取时间毫秒值
        System.out.println(d1);
        System.out.println(l1);

        c1.set(Calendar.YEAR,2018);//修改日历某部分信息
        c1.add(Calendar.DAY_OF_MONTH,-2);//为某个信息增加/减少指定的值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(c1.getTime()));
    }
}
