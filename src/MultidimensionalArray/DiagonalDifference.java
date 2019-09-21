package MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        System.out.println(Math.abs(first(matrix) - second(matrix)));

    }
    public static int first(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int second(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == n - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
