package MultidimensionalArray;

import java.util.*;
import java.util.stream.Collectors;

public class Crossfire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dimensions = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<List<Integer>> matrix = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < dimensions[0]; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < dimensions[1]; j++) {
                list.add(count++);
            }
            matrix.add(list);
        }
        String command = input.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            int[] arr = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int row = arr[0];
            int cow = arr[1];
            int radius = arr[2];

            for (int i = row - radius; i <= radius + row; i++) {
                if (isBound(matrix,i,cow)) {
                    matrix.get(i).set(cow, 0);
                }
            }
            for (int i = cow - radius; i <= cow + radius; i++) {
                if (isBound(matrix,row,i)){
                    matrix.get(row).set(i,0);
                }

            }
            delete(matrix);
            command = input.nextLine();
        }



        for (int a = 0 ; a < matrix.size(); a++) {
            for (int b = 0; b < matrix.get(a).size(); b++) {
                if (b < matrix.get(a).size() - 1 ) {
                    System.out.print(matrix.get(a).get(b) + " ");
                } else {
                    System.out.print(matrix.get(a).get(b));
                }
            }
            System.out.println();
        }
        //System.out.println();
    }
    private static  void delete (List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            matrix.set(i, matrix.get(i).stream().filter(element -> element != 0).collect(Collectors.toCollection(ArrayList::new)));
            if (matrix.get(i).size() == 0) {
                matrix.remove(i);
                i--;
            }
        }
    }
    private static boolean isBound(List<List<Integer>> matrix, int r, int c) {
        if(  r  >= 0 && r < matrix.size() && c >= 0 && matrix.get(r).size() > c) {
            return true;
        } else {
            return false;
        }

    }
}
