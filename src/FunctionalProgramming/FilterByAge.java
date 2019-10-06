package FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = input.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            map.put(name, age);
        }
        String condition = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        String criteria = input.nextLine();
        Predicate<Integer> result = predicate(condition, age);
        Consumer<Map.Entry<String, Integer>> result1 = consumer(criteria);
        map.entrySet()
                .stream()
                .filter(e -> result.test(e.getValue()))
                .forEach(e -> result1.accept(e));
    }
    static Predicate<Integer> predicate (String condition, int age) {
        Predicate<Integer> result ;
        if (condition.equals("older"))   {
            result = e -> e >= age;
        } else {
            result = e -> e <= age;
        }
        return result;
    }
    static Consumer<Map.Entry<String, Integer>> consumer(String str) {
        Consumer<Map.Entry<String, Integer>> result;
                if (str.equals("name")) {
                    result = e -> System.out.println(e.getKey());
                } else if (str.equals("age")) {
                    result = e -> System.out.println(e.getValue());
                } else {
                    result = e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue());
                }


        return result;

    }
}
