package K_ImpAPI.beforeJDK8Time;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //Date代表日期和时间
        Date d = new Date();//创建系统当前的日期时间对象
        System.out.println(d);

        Date d1 = new Date(1000);//把时间毫秒值转换成Date日期对象
        System.out.println(d1);

        long l1 = d.getTime();//从1970开始走到现在的总毫秒数
        System.out.println(l1);
        System.out.println(System.currentTimeMillis());
        d1.setTime(l1);//设置日期对象的时间为当前时间毫秒值对应的时间
        System.out.println(d1);
    }
}
