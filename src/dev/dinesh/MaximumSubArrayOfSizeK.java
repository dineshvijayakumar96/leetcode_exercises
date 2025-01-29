package dev.dinesh;

public class MaximumSubArrayOfSizeK {
    public static void main(String[] args) {

        int[] array = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        int sum = 0;
        int maxSum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
            if (count == k) {
                maxSum = Math.max(maxSum, sum);
                count = 0;
                sum = 0;
                i--;
            }
        }

        System.out.println("Output: " + maxSum);
    }
}
