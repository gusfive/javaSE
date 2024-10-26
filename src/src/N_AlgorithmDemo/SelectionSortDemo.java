package N_AlgorithmDemo;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        //选择排序：每轮选择当前位置，开始找出后面的较小值与该位置交换
        int[] data = {4,8,2,1,3,2,0,7,5};
//        for (int i = 0; i < data.length - 1; i++) {
//            for (int j = 1; j < data.length - i; j++) {
//                if (data[i] > data[j + i]){
//                    int temp = data[i];
//                    data[i] = data[j + i];
//                    data[j + i] = temp;
//                }
//            }
//        }
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[minIndex] > data[j]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
