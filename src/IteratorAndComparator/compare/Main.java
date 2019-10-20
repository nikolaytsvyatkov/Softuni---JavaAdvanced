package IteratorAndComparator.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Person1> people = new ArrayList<>();
        String[] command = input.nextLine().split(" ");
        while (!command[0].equals("END")) {
            Person1 p = new Person1(command[0], Integer.parseInt(command[1]), command[2]);
            people.add(p);
            command = input.nextLine().split(" ");
        }
        int n = Integer.parseInt(input.nextLine());
        Person1 p = people.get(n - 1);
        int count = 0;
        for (Person1 pe : people) {
            if (p.compareTo(pe) == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d%n",count, people.size() - count, people.size());
        }
    }
}
