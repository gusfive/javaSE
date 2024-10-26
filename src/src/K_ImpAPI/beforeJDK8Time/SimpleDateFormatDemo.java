package K_ImpAPI.beforeJDK8Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
      //代表简单日期格式化，可以用来把日期对象、时间毫秒值格式化成我们想要的形式。

        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        SimpleDateFormat s1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ");//设置格式
        System.out.println(s1.format(d));//将Date格式化为字符串
        System.out.println(s1.format(time));//将时间毫秒值long化为字符串

        String str = "1970年01月01日 08:00:01 ";
        System.out.println(s1.parse(str));//将符合格式的String转为Date
    }
}
