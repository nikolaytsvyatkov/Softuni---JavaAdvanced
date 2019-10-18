package Generics.customlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();
        String command = input.nextLine();
        while (!command.equals("END")) {
            String[] strings = command.split(" ");
            switch (strings[0]) {
                case "Add":
                    customList.add(strings[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(strings[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(strings[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(strings[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    for (String i : customList) {
                        System.out.println(i);
                    }
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;

            }
            command = input.nextLine();
        }
    }
}
