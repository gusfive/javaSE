package Q_CollectionFramework;

public class CollectionsDemo {
    public static void main(String[] args) {
        /**可变参数：一种特殊形参，定义在方法、构造器里，格式是：数据类型。。。参数名称
         *      特点：可以不传数据给它；可以传一个或者同时传多个数据给它；也可以传一个数组给它。
         *      好处：常常用来灵活的接收数据。
         */

        test();
        test(1);
        test(1,2,3,40);
        test(new int[]{1,2,3,5});
    }
        //注意事项1：一个形参列表只有一个可变参数
        //注意事项2：可变参数必须放在形参列表的最后面
    public static void test(int...nums){
        //可变参数在方法内部本质就是一个数组
        System.out.println(nums.length);
    }
}
