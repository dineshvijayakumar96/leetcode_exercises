package dev.dinesh;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {3,2,4};

        int[] result = sum(nums, 6);

        System.out.println(Arrays.toString(result));
    }

    public static int[] sum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>(); // To store numbers and their indices
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i}; // Return indices if complement is found
            }
            map.put(nums[i], i); // Store the current number and its index
        }
        return new int[] {}; // Return empty if no solution is found
    }

    public static int[] sum2(int[] nums, int target) {

        int[] result = new int[]{};
        boolean success = false;

        for (int i = 0; i < nums.length; i++) {
            if (success) {
                break;
            } else {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] + nums[j] == target) {
                        result = new int[] {i, j};
                        success = true;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
