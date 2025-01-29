package dev.dinesh;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {

        int[] nums = { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 };
        int k = 2;

        System.out.println("Output: " + findLength(nums, k));
    }

    private static int findLength(int[] nums, int k) {

        int windowStart = 0, maxLength = 0, maxOnesCount = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {

            if (nums[windowEnd] == 1) maxOnesCount++;

            if (windowEnd - windowStart + 1 - maxOnesCount > k) {
                if (nums[windowStart] == 1) maxOnesCount--;
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
