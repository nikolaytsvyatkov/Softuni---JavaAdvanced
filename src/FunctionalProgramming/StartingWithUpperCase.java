package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StartingWithUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Predicate<String> func = e -> Character.isUpperCase(e.charAt(0));
        String[] strings = input.nextLine().split(" ");
        List<String> list = Arrays.stream(strings).filter(e -> func.test(e)).collect(Collectors.toList());
        System.out.println(list.size());

        list.stream().forEach( e-> System.out.println(e));
    }
}
