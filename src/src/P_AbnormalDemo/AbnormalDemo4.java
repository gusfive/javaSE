package P_AbnormalDemo;

import java.util.Scanner;

public class AbnormalDemo4 {
    public static void main(String[] args) {
        //开发中对于异常的常见处理方式：2.捕获异常，尝试重新修复
        //尝试修复
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("请输入合适的数字！");
            }
        }
    }

    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入合适的价格");
            double price = sc.nextDouble();
            if (price >= 0){
                return price;
            }else{
                System.out.println("价格不合适");
            }
        }
    }
}
