package Ka_ArraysDemo;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysDemo {
    public static void main(String[] args) {
        //操作数组的一个工具类

        int[] arr1 = {1,2,3};
        System.out.println(Arrays.toString(arr1));//返回数组的内容

        int[] arr2 = Arrays.copyOfRange(arr1,0,1);//拷贝数组（指定范围，包前不包后）

        int[] arr3 = Arrays.copyOf(arr1,2);//拷贝数组，指定新数组的长度

        //把数组中的原数据改为新数据存进去
        double[] prices = {99.8,128,100};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value]*0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

        //对数组进行排序
        int[] arr4 = new int[]{5,8,6,2,1};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
