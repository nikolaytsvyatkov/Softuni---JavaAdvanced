package FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartyReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> names = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());
        Map<String, Predicate<String>> map = new LinkedHashMap<>();
        String command = input.nextLine();
        while (!command.equals("Print")) {
            String[] strings = command.split(";");
            String addOrRemove = strings[0];
            String type = strings[1];
            String argument = strings[2];
            String str = type.concat(" " + argument);
            if (addOrRemove.contains("Add ")) {
                Predicate<String> predicate = predicate(type, argument);
                map.put(str, predicate);

            } else {
                map.remove(str);
            }
            command = input.nextLine();
        }
        for (Map.Entry<String, Predicate<String>> entry : map.entrySet()) {
            Predicate<String> pred = entry.getValue();
            names = names.stream().filter(e -> !pred.test(e)).collect(Collectors.toList());
        }
        names.forEach(e -> System.out.print(e + " "));
    }
    static Predicate<String> predicate(String type, String argument) {
        Predicate<String> predic;
        switch (type) {
            case "Starts with":
                predic = e -> e.startsWith(argument);
                return predic;
            case "Ends with":
                predic = e -> e.endsWith(argument);
                return predic;
            case "Length":
                predic = e -> e.length() == Integer.parseInt(argument);
                return predic;
            case "Contains":
                predic = e -> e.contains(argument);
                return predic;
        }
        return null;
    }
}
