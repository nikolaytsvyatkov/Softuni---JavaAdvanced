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
                    int x = Math.abs( a % 2);
                    int y = Math.abs( b % 2);
                    return Integer.compare(x, y);

        }).forEach(e -> System.out.print(e + " "));
    }
}
