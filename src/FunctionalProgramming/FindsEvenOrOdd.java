package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindsEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m =  input.nextInt();
       input.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = n ; i <=m; i++) {
            list.add(i);
        }
        String str = input.nextLine();
        Predicate<Integer> integerPredicate =  predicate(str);
        list.stream().filter(e -> integerPredicate.test(e))
        .forEach(e -> System.out.print(e + " "));

    }
    static Predicate<Integer> predicate(String string) {
        Predicate<Integer> resultl;
        if (string.equals("odd")) {
            resultl = e -> e % 2 != 0;
        } else {
            resultl = e -> e % 2 == 0;
        }
        return resultl;
    }
}
