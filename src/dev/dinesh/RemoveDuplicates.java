package dev.dinesh;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] input = {2, 3, 3, 3, 6, 9, 9};

        System.out.println("Output: " + findDuplicates(input));
    }

    private static int findDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return k;
    }
}
