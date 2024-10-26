package O_RegularExpressionDemo;

import java.util.Scanner;

public class RegexDemo2 {
    public static void main(String[] args) {
        checketime();
    }

    public static void checkphone(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您的电话号码");
            String phone = sc.nextLine();

            if (phone.matches("\\d{11}")){
                System.out.println("格式正确");
                break;
            }else {
                System.out.println("格式不正确");
            }
        }
    }

    public static void checkemail(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您的邮箱");
            String phone = sc.nextLine();

            if (phone.matches("\\w{5,20}@\\w{2,9}\\.com((\\.cn)?)")){
                System.out.println("格式正确");
                break;
            }else {
                System.out.println("格式不正确");
            }
        }
    }

    public static void checketime(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入时间");
            String phone = sc.nextLine();

  //          if (phone.matches("(19|20)\\d{2}年(0[1-9]|1[0-2])月(0[1-9]|[1-2][0-9]|3[0-1])日([0-1][0-9]|2[0-3])时([0-5][0-9])分([0-5][0-9])秒")){
            if (phone.matches("(19|20)\\d{2}年(0[1-9]|1[0-2])月([0-2][0-9]|3[01])日([01][0-9]|2[0-3])时[0-5][0-9]分[0-5][0-9]秒")){
                System.out.println("格式正确");
                break;
            }else {
                System.out.println("格式不正确");
            }
        }
    }
}
