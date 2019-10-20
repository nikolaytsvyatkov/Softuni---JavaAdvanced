package StrategyPattern;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Person> people = new HashSet<>();
        Set<Person> people1 = new HashSet<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = input.nextLine().split(" ");
            Person person = new Person(command[0], Integer.parseInt(command[1]));
            people.add(person);
            people1.add(person);
        }
        people.stream().sorted(new Compator1()).forEach(e -> System.out.println(e.toString()));
        people1.stream().sorted(new Comparator2()).forEach(e -> System.out.println(e.toString()));


    }
}
