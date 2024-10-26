package A_learn.basic;

public class basic_method {
    public static void main(String[] args) {
        //一般方法调用
        int a = sum(3,20);
        System.out.println(a);

        /**注意事项
         * 形参列表可以有多个甚至没有
         * 若有多个形参，必须用，隔开
         * 形参不能给初始值
         */
        //无参数无返回值方法调用
        printHello();

        //有参数无返回值方法调用
        printHello(3);

        /**方法使用的常见问题
         *方法在class里的位置前后无所谓，但是一个方法不能定义在另一个方法里。
         * 无返回必须用void，不能用return x;有返回值则必须用对应的return。
         * return语句下方的代码不会执行。
         * 方法不调用则不执行，调用方法时，输入的数据必须严格匹配方法的参数情况。
         * 调用有返回值的方法，可以定义变量接收结果，或者直接输出调用，甚至直接调用。
         * 无返回值的方法，只能直接调用。
         */

        /*方法在计算机中的执行原理
          方法被调用时，进入到栈内存中运行。栈是先进后出，保证用完一个方法调用完另一个方法后，可以回来。
         */

        /**JAVA的参数传递机制
         *基本类型的参数传递
         * 实参：在方法内部定义的变量。
         * 形参：定义方法时“（……）”中所声明的参数。
         * 值传递：传输实参给方法的形参时，传输的是实参变量中存储的值的副本。
         *
         * 引用类型的参数传递
         * 值传递：传递的是存储的地址值。
         */

        /**方法重载
         *一个类中，出现多个方法的名称相同，但是它们的形参列表是不同的，那么这些方法称为方法重载。
         * 同一个CALSS中，只要一些方法的名称相同、形参不同，就是方法重载，不管修饰符,返回值等.
         * 形参不同指的是：个数、类型、顺序不同，形参的名称无所谓。
         */

        /**在方法中单独使用return关键字
         *return；可以用在无返回指定的方法中，作用是：立即跳出并结束当前方法的执行。
         */

        //内部循环结束外部循环：定义外部循环（OUT:），再用对应的关键字加上 外部循环名称即可。
        Out:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i){
                    continue Out;
                }
                System.out.println(j);
            }
        }
    }
    //一般方法
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }

    //无参数无返回值
    public static void printHello(){
        System.out.println("Hello");
    }

    //有参数无返回值
    public static void printHello(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello");
        }
    }

}
