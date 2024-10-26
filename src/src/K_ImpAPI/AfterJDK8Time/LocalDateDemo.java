package K_ImpAPI.AfterJDK8Time;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        //LocalDate代表本地日期（年、月、日、星期）

        //创建对象
        LocalDate ld = LocalDate.now();
        //获取日期对象中的信息
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        int dayOfWeek = ld.getDayOfWeek().getValue();

        //直接修改某个信息:withYear、withMonth、withDayOfMonth、withDayOfYear
        LocalDate ld2 = ld.withYear(2077);
        System.out.println(ld2);
        System.out.println(ld);

        //把某个信息加多少：plusYears plusMonths plusDays plusWeeks
        LocalDate ld3 = ld.plusDays(12);
        System.out.println(ld3);

        //把某个信息减多少：minusYears minusMonths minusDays minusWeeks

        //获取指定日期的LocalDate对象
        LocalDate ld4 = LocalDate.of(2077,5,20);
        System.out.println(ld4);

        //判断2个日期对象是否相等，在前还是在后：equals isBefore isAfter
        System.out.println(ld3.equals(ld4));
        System.out.println(ld3.isBefore(ld4));
        System.out.println(ld3.isAfter(ld4));
    }
}
