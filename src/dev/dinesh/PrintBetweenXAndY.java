package dev.dinesh;

import java.util.Scanner;

public class PrintBetweenXAndY {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = 0;
        int x = 0;
        int y = 0;

        System.out.println("Enter the size of Array:");
        sizeOfArray = scanner.nextInt();
        int[] intArray = new int[sizeOfArray];

        System.out.println("Enter the data:");
        for (int i = 0; i < sizeOfArray; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the Value for X:");
        x = scanner.nextInt();
        System.out.println("Enter the value for Y:");
        y = scanner.nextInt();

        for (int v : intArray) {
            if (v >= x && v <= y) {
                System.out.println("Output: " + v);
            }
        }
    }
}
