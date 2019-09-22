package MultidimensionalArray;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class VampireBunnies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dimensionals = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] matrix = new char[dimensionals[0]][dimensionals[1]];
        ArrayDeque<Integer> bStack = new ArrayDeque<>();
        ArrayDeque<Integer> pStack = new ArrayDeque<>();

        int[] currentDestination = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = input.nextLine().toCharArray();

        }
        currentDestination = findPlayer(matrix);
        String command = input.nextLine();
        boolean dead = false;
        boolean won = false;
        for (int i = 0; i < command.length(); i++) {
        }
    }
    public  static int[] findPlayer(char[][] matrix) {
        int[] arr = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'P') {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
    public static boolean isBound(char[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
    public static boolean  bunnyMovement (char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'B') {
                    if (isBound(matrix, i + 1, j)) {
                        if (matrix[i + 1][j] == '.') {
                            matrix[i+ 1][j] = 'B';
                        } else if ((matrix[i + 1][j] == 'P')) {
                            return false;
                        }
                    }
                    if (isBound(matrix, i - 1, j)) {
                        if (matrix[i - 1][j] == '.') {
                            matrix[i - 1][j] = 'B';
                        } else if ((matrix[i - 1][j] == 'P')) {
                            return false;
                        }
                    }
                    if (isBound(matrix, i, j + 1)) {
                        if (matrix[i ][j + 1] == '.') {
                            matrix[i ][j + 1] = 'B';
                        } else if ((matrix[i][j + 1] == 'P')) {
                            return false;
                        }
                    }
                    if (isBound(matrix, i, j - 1)) {
                        if (matrix[i ][j - 1] == '.') {
                            matrix[i ][j - 1] = 'B';
                        } else if ((matrix[i][j - 1] == 'P')) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
