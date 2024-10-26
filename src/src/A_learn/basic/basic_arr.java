package A_learn.basic;

public class basic_arr {
    public static void main(String[] args) {
        //静态化初始数组的定义
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = {1,2,3};
        //动态化数组的定义
        int[] arr3 = new int[3];
        //数组的访问
        int data = arr1[1];
        arr1[1] = 0;
        System.out.println(arr1.length);
        /**常见问题
         * 不要访问超过数组的最大索引
         * null数组不得访问元素，不得访问长度
         */
    }
}
