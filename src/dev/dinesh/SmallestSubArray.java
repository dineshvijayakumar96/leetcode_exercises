package dev.dinesh;

public class SmallestSubArray {
    public static void main(String[] args) {

        int[] array = { 2, 1, 5, 2, 8 };
        int k = 7;
        int sum = 0;
        int minLength = 0;
        int srink = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

            if (sum >= k && count == 0) {
                count++;
                minLength = i + 1;
                sum -= array[srink++];
            } else if (array[i] >= k) {
                minLength = 1;
                break;
            } else if (sum >= k && count > 0) {
                minLength = Math.min(minLength, i + 1);
                sum -= array[srink++];
            }

            if (sum >= k) {
                minLength = Math.min(minLength, i - 1);
                sum -= array[srink++];
            }
        }

        System.out.println("Output: " + minLength);
    }
}
