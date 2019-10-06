package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> people = Arrays.stream(input.nextLine().split(" ")).collect(Collectors.toList());

        String command = input.nextLine();
        while (!command.equals("Party!")) {
            String[] strings = command.split(" ");
            String com = strings[0];
            String type = strings[1];
            String argument = strings[2];
            if (com.equals("Remove")) {
                Predicate<String> predicate = predicate(type, argument);
                people.removeIf(e -> predicate.test(e));
            } else {
                for (int i = 0; i < people.size(); i++) {
                    String p = people.get(i);
                    if (predicate(type, argument).test(people.get(i))) {
                        people.add(i++, p);
                    }
                }
            }

            command = input.nextLine();

        }
        Collections.sort(people);
        if (people.size() != 0) {
            for (int i = 0; i < people.size(); i++) {
                if (i != people.size() - 1) {
                    System.out.print(people.get(i) +", ");
                } else {
                    System.out.print(people.get(i) + " are going to the party!");
                }
            }
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
    static Predicate<String> predicate ( String criteria, String argument)  {
        Predicate<String> result;

            switch (criteria) {
                case "StartsWith":
                   return result = e -> e.startsWith(argument);
                case "EndsWith":
                    return  result = e -> e.endsWith(argument);
                case "Length":
                    return result = e -> {
                        int n = Integer.parseInt(argument);
                        return e.length() == n;
                    };


            }
            return null;
}}
