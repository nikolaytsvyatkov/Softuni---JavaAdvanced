package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPreicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        List<Integer> divisible = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Predicate<Integer> predicate = e -> {
            boolean result = false;
            for (int i = 0; i < divisible.size(); i++   ) {
                result = e % divisible.get(i) == 0;
                if (!result)     {
                    return false;
                }
            }
            if (result ) {
                return  true;
            }
            return false;

        };
        list.stream().
                filter(e -> predicate.test(e)).
                forEach(e -> System.out.print(e + " "));
    }
}
