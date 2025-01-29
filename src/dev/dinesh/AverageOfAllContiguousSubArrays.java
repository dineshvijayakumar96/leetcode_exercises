package dev.dinesh;

import java.util.Arrays;

public class AverageOfAllContiguousSubArrays {
    public static void main(String[] args) {

        int[] array = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        int k = 5;

        double[] output = new double[array.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {

            windowSum += array[windowEnd];
            if (windowEnd >= k - 1) {
                output[windowStart] = windowSum / k;
                windowSum -= array[windowStart];
                windowStart++;
            }
        }

        System.out.println(Arrays.toString(output));
    }
}
