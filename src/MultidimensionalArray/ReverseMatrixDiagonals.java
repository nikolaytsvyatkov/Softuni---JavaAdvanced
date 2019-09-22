package MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[arr[0]][arr[1]];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int row = arr[0] - 1;
        int col = arr[1] - 1;
        int curentRow = row;
        int curentCol = col;

        while (curentCol >= 0 && row>= 0) {
            while (curentRow >= 0 && curentRow < arr[0] && curentCol >= 0 && curentCol < arr[1]) {
                System.out.print(matrix[curentRow--][curentCol++] + " ");
            }
            System.out.println();

                col--;
                curentCol = col;

                if (curentCol < 0) {
                    curentCol = 0;
                    row--;
                    curentRow = row;

                } else {
                    curentRow = row;
                }


        }


    }
}
