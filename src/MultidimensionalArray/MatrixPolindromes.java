package MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixPolindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char current = 'a';
        int[] dimensional = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cow = dimensional[1];
        int row = dimensional[0];
        String[][] matrix = new String[row][cow];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(current);
                sb.append((char)(current + j));
                sb.append(current);
                matrix[i][j] = sb.toString();
            }
            current = (char) ('a' + 1 + i);
        }
        print(matrix);
    }
    public static void print(String[][] matrix){
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
