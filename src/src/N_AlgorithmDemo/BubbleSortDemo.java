package N_AlgorithmDemo;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        //冒泡排序：每次从数组中找出最大值放在数组的后面
        int[] data = {4,8,2,1,3,2,0,7,5};
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < (data.length - (i + 1)); j++) {
                if (data[j] > data[j + 1]){
                    int s = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = s;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
