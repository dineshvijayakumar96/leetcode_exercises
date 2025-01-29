package dev.dinesh;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);

        System.out.println("Length of Substring = " + result);
    }

    public static int lengthOfLongestSubstring(String s) {

        String[] splitted = s.split("");
        String[] finalWord = new String[splitted.length];
        int count = 0;

        for (int i = 0; i < splitted.length; i++) {
            for (int j = 0; j < finalWord.length; j++) {
                if (!splitted[i].equals(finalWord[j])) {
                    finalWord[j] = splitted[i];
                }
            }
        }

        System.out.println("Final Letter:");
        for (String letter : finalWord) {
            System.out.println(letter);
            if (letter != null) {
                count++;
            }
        }

        return count;
    }
}
