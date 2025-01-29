package dev.dinesh;

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = 0;
        int gap = 0;
        int total = 0;

        System.out.println("Enter the size of Array:");
        sizeOfArray = scanner.nextInt();
        int[] intArray = new int[sizeOfArray];

        System.out.println("Enter the data:");
        for (int i = 0; i < sizeOfArray; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the Gap:");
        gap = scanner.nextInt();

        for (int i = 0; i < gap; i++) {
            for (int j = i; j < sizeOfArray; j += gap) {
                total += intArray[j];
            }
            System.out.println("Output: " + total);
            total = 0;
        }

        System.out.println("Output: " + total);
    }
}
