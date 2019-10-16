package AdvancedExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Excel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<String>> matrix = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            List<String> str = Arrays.stream(input.nextLine().split(", ")).collect(Collectors.toList());
            matrix.add(str);
        }
        String[] command = input.nextLine().split(" ");
        if (command[0].equals("hide")) {
            int index = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < matrix.get(i).size(); j++) {
                    if (matrix.get(i).get(j).equals(command[1])) {
                        index = j;
                        flag = true;
                        break;
                    }

                }
                if (flag) {
                    break;
                }
            }
            for (int i = 0 ; i < n; i++) {
                matrix.get(i).remove(index);
            }
        } else if (command[0].equals("sort")) {

        } else if (command[0].equals("filter"))  {

        }
    }
}
