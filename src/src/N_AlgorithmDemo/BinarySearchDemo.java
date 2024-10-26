package N_AlgorithmDemo;

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        //二分查找：前提条件：数组中的数据必须是有序的
        int[] data = {4,8,2,1,3,2,0,7,5,5};
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
        int s = 5;
//        int begin = 0;
//        int end = data.length - 1;
//        int half = Math.round((begin + end) / 2);
//        while (half != begin && half != end)  {
//            if (s < data[half]){
//                end = half;
//            }else {
//                begin = half;
//            }
//            half = Math.round((begin + end) / 2);
//        }
//
//        if (data[half] == s){
//            System.out.println("该数据索引为"+half);
//        }else if (data[half + 1] == s){
//            System.out.println("该数据索引为"+(half + 1));
//        }else{
//            System.out.println("该数据不存在");
//        }
        System.out.println(binarySearch(data, 0));

        System.out.println(Arrays.binarySearch(data, 5));
    }

    public static int binarySearch(int[] data,int s){
        int begin = 0;
        int end = data.length - 1;
        while (begin <= end){
            int half = (begin + end) / 2;
            if (s < data[half]){
                end = half - 1;
            }else if (s > data[half]){
                begin = half + 1;
            }else{
                return half;
            }
        }
        return -1;
    }
}
