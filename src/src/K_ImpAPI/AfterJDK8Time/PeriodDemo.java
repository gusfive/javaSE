package K_ImpAPI.AfterJDK8Time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        //用于计算两个LocalDate对象相差的年数、月数、天数
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2077,5,20);
        Period p1 = Period.between(ld1,ld2);//构造器

        //计算隔了几年
        System.out.println(p1.getDays());
    }
}
