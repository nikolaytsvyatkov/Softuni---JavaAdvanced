package MultidimensionalArray;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split(", ");
        int size = Integer.parseInt(strings[0]);
        int[][] matrix = new int[size][size];
        String type = strings[1];
        switch (type) {
            case "A":
                matrix = typeA(matrix);
                break;
            case "B":
                matrix = typeB(matrix);
                break;
        }
        print(matrix);

    }
    public static int[][] typeA (int[][] matrix){
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = count++;
            }
        }
        return matrix;
    }
    public static void print(int[][] matrix){
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public  static int[][] typeB(int[][] matrix) {
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = count++;
                }
            } else {
                for (int j = matrix[i].length - 1; j>=0; j--) {
                    matrix[j][i] = count++;
                }
            }
        }
        return matrix;
    }
}
