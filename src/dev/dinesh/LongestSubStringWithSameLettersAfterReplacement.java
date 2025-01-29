package dev.dinesh;

import java.util.HashMap;

public class LongestSubStringWithSameLettersAfterReplacement {
    public static void main(String[] args) {

        String s = "ABAB";
        int k = 2;

        System.out.println("Output: " + replacingCharacters(s, k));
    }

    private static int replacingCharacters(String s, int k) {

        int startWindow = 0, maxLength = 0, maxLetterRepeatCount = 0;
        HashMap<Character, Integer> letterFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {

            char rightChar = s.charAt(windowEnd);
            letterFrequencyMap.put(rightChar, letterFrequencyMap.getOrDefault(rightChar, 0) + 1);
            maxLetterRepeatCount = Math.max(maxLetterRepeatCount, letterFrequencyMap.get(rightChar));

            if (windowEnd - startWindow + 1 - maxLetterRepeatCount > k) {

                char leftChar = s.charAt(startWindow);
                letterFrequencyMap.put(leftChar, letterFrequencyMap.get(leftChar) - 1);
                startWindow++;
            }

            maxLength = Math.max(maxLength, windowEnd - startWindow + 1);
        }

        return maxLength;
    }
}
