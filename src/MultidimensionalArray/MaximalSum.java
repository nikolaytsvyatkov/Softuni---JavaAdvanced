package MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dimensionals = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[dimensionals[0]][dimensionals[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int maxRow = 0;
        int maxCow = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j +2] + matrix[i + 2][j] +matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (currentSum > max) {
                    max = currentSum;
                    maxRow = i;
                    maxCow = j;
                }
            }
        }
        System.out.println("Sum = " + max);
        print(matrix,maxRow,maxCow);
    }
    public static void print(int[][] matrix, int row,int cow){
        int count = 1;
        for (int i = row; i < row + 3; i++) {
            for (int j = cow; j < cow + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
