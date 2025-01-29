package dev.dinesh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestContiguousPairSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = 0;
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        int maxSum = 0;

        System.out.println("Enter the size of Array:");
        sizeOfArray = scanner.nextInt();
        int[] intArray = new int[sizeOfArray];

        System.out.println("Enter the data:");
        for (int i = 0; i < sizeOfArray; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < sizeOfArray - 1; i++) {
            int[] pair = new int[2];
            int sum = 0;

            pair[0] = intArray[i];
            pair[1] = intArray[i + 1];
            sum = intArray[i] + intArray[i + 1];

            map.put(sum, pair);

            if (maxSum < sum) maxSum = sum;
        }

        System.out.println("Sum: " + maxSum);
        System.out.println("Pair: " + Arrays.toString(map.get(maxSum)));
    }
}
