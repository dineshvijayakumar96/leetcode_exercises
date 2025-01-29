package dev.dinesh;

public class MaximumSubArray {
    public static void main(String[] args) {

        int[] nums = { -3,-2,-2,-3 };
        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("The total sum: " + maxSum);
    }
}
