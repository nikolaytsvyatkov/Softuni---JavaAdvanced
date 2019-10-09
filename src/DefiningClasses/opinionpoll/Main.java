package DefiningClasses.opinionpoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] strings = input.nextLine().split(" ");
            Person p = new Person(strings[0], Integer.parseInt(strings[1]));
            list.add(p);
        }
        list.stream().filter(e -> e.getAge() > 30).sorted((a, b) -> {
            return a.getName().compareTo(b.getName());
        }).forEach(e -> {
            System.out.printf("%s - %d%n", e.getName(), e.getAge());
        });
    }
}
