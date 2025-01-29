package dev.dinesh;

import java.util.HashMap;

public class NoRepeatSubstring {
    public static void main(String[] args) {

        String s = "dvdf";

        System.out.println("Output: " + longestSubstring(s));;
    }

    private static int longestSubstring(String s) {

        HashMap<Character, Integer> result = new HashMap<>();
        int windowStart = 0;
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {

            char rightChar = s.charAt(windowEnd);

            if (result.containsKey(rightChar)) {
                windowStart = Math.max(windowStart, result.get(rightChar) + 1);
            }

            result.put(rightChar, windowEnd);

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
