package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(", "))
                .map(e -> Integer.parseInt(e))
                .filter(e -> e % 2 ==0)
                .collect(Collectors.toList());
        print(numbers);
        numbers = numbers.stream().sorted((a, b) ->{
            return a.compareTo(b);
        }).collect(Collectors.toList());
        print(numbers);
    }

    private static void print(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                System.out.printf("%d, ",numbers.get(i));
            } else {
                System.out.printf("%d",numbers.get(i));
            }

        }
        System.out.println();
    }
}
