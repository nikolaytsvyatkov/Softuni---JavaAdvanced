package FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(input.nextLine());
        Predicate<Integer> predicate = e -> e % n != 0;
         list = list.stream().filter(e -> predicate.test(e)).collect(Collectors.toList());
        Collections.reverse(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
