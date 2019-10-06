package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSMallestELement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       List<Integer> list = Arrays.stream(input.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        Function<List<Integer>, Integer> smallestIndex= e -> {
            int index = 0;
            for (int i = 1; i < e.size(); i++) {
                if (e.get(index) >= e.get(i))    {
                    index = i;
                }
            }
            return index;
        };
        int index = smallestIndex.apply(list);
        System.out.println(index);

    }
}
