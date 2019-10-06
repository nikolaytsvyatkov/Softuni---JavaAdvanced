package FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartyReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = Arrays.stream(input.nextLine().split(" ")).collect(Collectors.toList());
        String command = input.nextLine();
        List<String> start = new ArrayList<>();
        List<String> end = new ArrayList<>();
        List<String> length = new ArrayList<>();
        List<String> contains = new ArrayList<>();

        while (!command.equals("Print")) {
            String[] strings = command.split(";");
            String com = strings[0];
            String type = strings[1];
            String argument = strings[2];

            if (com.equals("Add filter")) {
                switch (type) {
                    case"Starts with":
                        start = list.stream().filter(e ->predicate(type,argument).test(e)).collect(Collectors.toList());
                        list  = list.stream().filter(e ->!predicate(type,argument).test(e)).collect(Collectors.toList());
                        break;
                    case "Ends with":
                        end = list.stream().filter(e ->predicate(type,argument).test(e)).collect(Collectors.toList());
                        list  = list.stream().filter(e ->!predicate(type,argument).test(e)).collect(Collectors.toList());
                        break;
                    case "Length":
                        length = list.stream().filter(e ->predicate(type,argument).test(e)).collect(Collectors.toList());
                        list  = list.stream().filter(e ->!predicate(type,argument).test(e)).collect(Collectors.toList());
                        break;
                    case "Contains":
                       contains = list.stream().filter(e ->predicate(type,argument).test(e)).collect(Collectors.toList());
                        list  = list.stream().filter(e ->!predicate(type,argument).test(e)).collect(Collectors.toList());
                       break;
                }
            } else {
                switch (type) {
                    case"Starts with":
                        list.addAll(start);
                        break;
                    case "Ends with":
                        list.addAll(end);
                        break;
                    case "Length":
                        list.addAll(length);
                        break;
                    case "Contains":
                        list.addAll(contains);
                        break;
                }
            }
            command = input.nextLine();
        }

        list.stream().forEach(e -> System.out.print(e + " "));
    }
    static  Predicate<String> predicate (String type, String argument) {
        switch (type) {
            case"Starts with":
                return e -> e.startsWith(argument);
            case "Ends with":
                return e -> e.endsWith(argument);
            case "Length":
                return e -> e.length() == Integer.parseInt(argument);
            case "Contains":
                return  e -> e.contains(argument);
        }
        return null;
    }
}
