package IteratorAndComparator.CustomStack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        String command = input.nextLine();
        while (!command.equals("END")) {
            if (command.contains("Push")) {
                command = command.replace("Push ","");
                command = command.replaceAll(" ","");
                List<Integer> list = Arrays.stream(command.split(",")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
                for (int i : list) {
                    stack.push(i);
                }

            } else if (command.contains("Pop")) {
                try {
                    stack.pop();
                }catch (IndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }

            }

            command = input.nextLine();
        }
        stack.print();
    }
}
