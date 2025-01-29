package dev.dinesh;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {

        String s = "zxyzxyz";

        String[] sArray = s.split("");

        String output = sArray[1];

        for (int i = 1; i < sArray.length; i++) {

            if (!output.contains(sArray[i])) {
                output = output.concat(sArray[i]);
            }
        }

        System.out.println("Output: " + output.length());
        System.out.println("Substrings: " + output);

    }
}
