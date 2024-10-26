package Test1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class num3Demo1 {
    public static void main(String[] args) {
        justice();
    }

    private static void justice() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入年份");
            String year = sc.nextLine();
            System.out.println("请输入月份");
            String month = sc.nextLine();
            if (year.matches("\\d{4}") && month.matches("\\d{1,2}")){
                int Year = Integer.valueOf(year);
                int Month = Integer.valueOf(month);
                if ((Year == 2022 && Month >= 3) | (Year > 2022 && Month < 13 && Month > 1 )){
                run(Year,Month);
                break;
                }else {
                    System.out.println("请输入正确的范围，2022-2之后的月份");
                }
            }else {
                System.out.println("请输入正确的数字代表年和月");
            }
        }
    }

    private static void run(int year, int month) {
        LocalDateTime first = LocalDateTime.of(2022,2,3,0,0,0);
        LocalDateTime begin = LocalDateTime.of(year,month,1,0,0,0);
        LocalDateTime end = LocalDateTime.of(year,month + 1,1,0,0,0);
        for (LocalDateTime Day = begin; Day.isBefore(end); Day = Day.plusDays(1)) {
            Duration period = Duration.between(first,Day);
            DateTimeFormatter MM = DateTimeFormatter.ofPattern("MM");
            DateTimeFormatter dd = DateTimeFormatter.ofPattern("EEE");
            long dp = period.toDays();
            if (dp % 3 == 0){
                    System.out.println(Day.getYear() + "-" + MM.format(Day) + "-" + Day.getDayOfMonth() + "[休息]"+dd.format(Day));
            }else {
                System.out.println(Day.getYear()+"-"+MM.format(Day)+"-"+Day.getDayOfMonth()+dd.format(Day));
            }
        }
    }
}
