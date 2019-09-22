package MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasumnet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = Integer.parseInt(input.nextLine());
        int[][] matrix = new int[rows][];

        for (int i = 0 ; i < matrix.length; i++) {
            int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        int[][] matrix1 = newMatrix(matrix);
       int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int invalidValue = matrix[arr[0]][arr[1]];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == invalidValue) {
                    int sum = sum(matrix, i, j, invalidValue);
                    matrix1[i][j] = sum;
                }
            }
        }
        print(matrix1);
    }
    public static boolean isBound(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && matrix[r].length > c;
    }
    public static int sum(int[][] matrix, int r, int c, int n) {
        int sum = 0;
        if (isBound(matrix, r - 1, c)) {
            if (matrix[r - 1][c] != n) {
                sum += matrix[r - 1][c];
            }
        }
        if (isBound(matrix, r + 1, c)) {
            if (matrix[r + 1][c] != n) {
                sum += matrix[r + 1][c];
            }
        }
        if (isBound(matrix, r, c - 1)) {
            if (matrix[r][c - 1] != n) {
                sum += matrix[r][c - 1];
            }
        }
        if (isBound(matrix, r, c + 1)) {
            if (matrix[r][c + 1] != n) {
                sum += matrix[r][c + 1];
            }
        }
        return sum;
    }
    static  void print (int[][] matrix) {
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] newMatrix(int[][] matrix) {
        int[][] matrix1 = new int[matrix.length][];
        for (int i = 0 ; i < matrix.length; i++ ) {

                matrix1[i] = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix1[i][j] = matrix[i][j];
            }


        }
        return matrix1;
    }
}
