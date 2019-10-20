package IteratorAndComparator.ListlyIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String CreateCommand = input.nextLine();
        CreateCommand = CreateCommand.replace("Create ","");
        ListyIterator listyIterator ;
        if (CreateCommand.equals("Create")) {
            listyIterator = new ListyIterator();
        } else {
            listyIterator = new ListyIterator(CreateCommand.split(" "));
        }

        String command = input.nextLine();
        while (!command.equals("END")) {
            switch (command) {
                case "Move":
                    System.out.println(listyIterator.Move());
                    break;
                case "Print":
                    try {
                        listyIterator.Print();
                    }catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "HasNext":
                    System.out.println(listyIterator.HasNext());
                    break;
            }
            command = input.nextLine();
        }
    }
}
