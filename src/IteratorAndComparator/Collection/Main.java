package IteratorAndComparator.Collection;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String CreateCommand = input.nextLine();
        CreateCommand = CreateCommand.replace("Create ","");
        ListyIterator list;
        if (CreateCommand.equals("Create")) {
            list = new ListyIterator();
        } else {
            list = new ListyIterator(CreateCommand.split(" "));
        }

        String command = input.nextLine();
        while (!command.equals("END")) {
            switch (command) {
                case "Move":
                    System.out.println(list.Move());
                    break;
                case "Print":

                    try {
                        list.Print();
                    }catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "HasNext":
                    System.out.println(list.HasNext());
                    break;
                case "PrintAll":
                    list.PrintAll();
                    break;
            }
            command = input.nextLine();
        }
    }

    }

