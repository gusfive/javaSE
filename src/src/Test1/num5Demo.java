package Test1;

import java.util.Arrays;

public class num5Demo {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8};
        System.out.println(Arrays.toString(run(nums, 7)));

    }

    public static int[] run(int[] nums, int target) {
        int[] conse = {-1, -1};
        if (nums == null || nums.length == 0) {
            return conse;
        }
        int begin = 0;
        int end = nums.length - 1;
        // Find the left boundary of the target value
        while (begin <= end) {
            int half = (begin + end) / 2;
            if (nums[half] < target) {
                begin = half + 1;
            } else {
                end = half - 1;
            }
        }
        if (begin == nums.length || nums[begin] != target) {
            return conse;
        }
        conse[0] = begin;

        // Find the right boundary of the target value
        end = nums.length - 1;
        while (begin <= end) {
            int half = (begin + end) / 2;
            if (nums[half] <= target) {
                begin = half + 1;
            } else {
                end = half - 1;
            }
        }
        conse[1] = end;
        return conse;
    }
}
