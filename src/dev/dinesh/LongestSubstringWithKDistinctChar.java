package dev.dinesh;

import java.util.HashMap;

public class LongestSubstringWithKDistinctChar {
    public static void main(String[] args) {

        String input = "araaci";
        int k = 2;

        System.out.println("Output: " + longestSubString(input, k));
    }

    public static int longestSubString(String s, int k) {

        if (s.isEmpty() || k == 0) {
            return 0;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char currentCharacter = s.charAt(right);
            charCount.put(currentCharacter, charCount.getOrDefault(currentCharacter, 0) + 1);

            while (charCount.size() > k) {
                char leftCharacter = s.charAt(left);
                charCount.put(leftCharacter, charCount.get(leftCharacter) - 1);
                if (charCount.get(leftCharacter) == 0) {
                    charCount.remove(leftCharacter);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
