package AdvancedExams;

import java.util.*;
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
            int idexxx = index;
            List<String> keepHeader = new ArrayList<>();
            keepHeader = matrix.get(0);
            matrix.remove(0);
            matrix = matrix.stream().sorted(Comparator.comparing(a -> a.get(idexxx))).collect(Collectors.toList());
            matrix.add(0, keepHeader);

        } else if (command[0].equals("filter"))  {
            String header = command[1];
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

            String criteria = command[2];
            for (int i = 1; i < n; i++) {
                if (!matrix.get(i).get(index).equals(criteria)) {
                    matrix.remove(i);
                    i--;
                    n--;
                }

            }

        }
        for (int i = 0 ; i < matrix.size(); i++) {
            List<String> list = matrix.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (j != list.size() - 1) {
                    System.out.printf("%s | ",list.get(j));
                } else {
                    System.out.printf("%s", list.get(j));
                }
            }
            System.out.println();
        }
    }
}
