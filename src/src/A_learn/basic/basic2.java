package A_learn.basic;

public class basic2 {
    public static void main(String[] args) {
        /**分支结构
         * if
         * switch(注意事项：表达式不支持double；case的值不允许重复，只能是字面量
         *        没有break，则会出现穿透现象，即代码一直执行直到遇到break)
         */
        if (1 > 0){
            System.out.println("1比0大");
        }else {
            System.out.println("恭喜你推翻了人类数学");
        }

        int score = 59;
        switch (score / 60) {
            case 1 :
                System.out.println("及格");
                break;
            case 0:
                System.out.println("不及格");
                break;
            default:
                System.out.println("分数异常");
        }

        /**循环结构
         * for,while,do-while
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("hello1");
        }

        int a = 0;
        while(a < 3){
            System.out.println("hello2");
            a++;
        }

        int b = 0;
        do {
            System.out.println("hello3");
            b++;
        }while (b < 3);

        /**跳转关键字
         * break:结束所在循环
         * continue：跳过此次循环进入下一次循环
         */

        for (int i = 0; i < 3; i++) {
            if(i == 1){
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 3; i++) {
            if(i == 1){
                continue;
            }
            System.out.println(i);
        }

        //死循环
//        while(true){
//            System.out.println("hello");
//        }
    }
}
