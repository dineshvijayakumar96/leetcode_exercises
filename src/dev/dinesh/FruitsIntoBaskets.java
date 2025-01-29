package dev.dinesh;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};

        int result = totalFruit(fruits);
        System.out.println("Total trees: " + result);
    }

    public static int totalFruit(int[] fruits) {
        // Map to track the count of each fruit type in the current window
        Map<Integer, Integer> fruitCount = new HashMap<>();
        int maxLen = 0; // Maximum length of a valid window
        int start = 0; // Start of the sliding window

        // Iterate through the array
        for (int end = 0; end < fruits.length; end++) {
            // Add the current fruit to the map or increase its count
            fruitCount.put(fruits[end], fruitCount.getOrDefault(fruits[end], 0) + 1);

            // If we have more than two types of fruits, shrink the window
            while (fruitCount.size() > 2) {
                int fruitToRemove = fruits[start];
                fruitCount.put(fruitToRemove, fruitCount.get(fruitToRemove) - 1);

                // Remove the fruit from the map if its count is zero
                if (fruitCount.get(fruitToRemove) == 0) {
                    fruitCount.remove(fruitToRemove);
                }
                start++; // Move the start of the window forward
            }

            // Update the maximum length of the window
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
