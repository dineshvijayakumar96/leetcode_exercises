package dev.dinesh;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1,2,3 },
                { 4,5,6 },
                { 7,8,9 }
        };

        transposeImage(matrix);

        // reverse each row of the image
        for(int row = 0; row < matrix.length; row++) {
            int i = 0;
            int j = matrix[row].length - 1;
            while(i < j) {
                int tmp = matrix[row][i];
                matrix[row][i++] = matrix[row][j];
                matrix[row][j--] = tmp;
            }
        }

        for (int[] singleMatrix : matrix) {
            System.out.print(Arrays.toString(singleMatrix));
        }
    }

    private static void transposeImage(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i + 1; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
