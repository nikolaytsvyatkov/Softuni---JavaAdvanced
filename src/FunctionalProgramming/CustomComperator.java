package FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomComperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       List<Integer> arr = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        arr.stream()
                .sorted((a, b) ->{
                    int result = 0;
                    if (a % 2 == 0 && b % 2 != 0) {
                        result = -1;
                    } else if (a % 2 != 0 && b % 2 ==0) {
                        result = 1;
                    } else {
                        result = a - b;
                    }
                    return result;

        }).forEach(e -> System.out.print(e + " "));
    }
}
