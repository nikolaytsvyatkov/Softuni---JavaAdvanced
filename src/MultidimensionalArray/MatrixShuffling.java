package MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dimensionals = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[dimensionals[0]][dimensionals[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = input.nextLine().split(" ");
        }

        String command = input.nextLine();
        while (!command.equals("END")) {
            String[] strings = command.split(" ");
            if (strings[0].equals("swap") && strings.length == 5) {
                int row1 = Integer.parseInt(strings[1]);
                int row2 = Integer.parseInt(strings[3]);
                int cow1 = Integer.parseInt(strings[2]);
                int cow2 = Integer.parseInt(strings[4]);
                if (row1 < matrix.length && row1 >= 0 && row2 < matrix.length && row2 >= 0 && cow1 < dimensionals[1] && cow1 >= 0
                        && cow2 < dimensionals[1] && cow2 >= 0) {
                    String temp = matrix[row1][cow1];
                    matrix[row1][cow1] = matrix[row2][cow2];
                    matrix[row2][cow2] = temp;
                    print(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = input.nextLine();
        }
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
