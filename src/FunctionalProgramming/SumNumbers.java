package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Function<String, Integer> funct = e -> Integer.parseInt(e);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(", ")).map(e -> funct.apply(e))
                .collect(Collectors.toList());
        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + numbers.stream().mapToInt(e -> e).sum());
    }
}
