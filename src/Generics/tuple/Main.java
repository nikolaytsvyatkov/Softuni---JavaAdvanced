package Generics.tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] string1 = input.nextLine().split(" ");
        String name = string1[0] + " " + string1[1];
        String cityPart = string1[2];
        String town = string1[3];

        String[] string2 = input.nextLine().split(" ");
        String name2 = string2[0];
        int liters = Integer.parseInt(string2[1]);
        boolean flag;
        if (string2[2].equals("drunk")) {
            flag = true;
        } else {
            flag = false;
        }

        String[] string3 = input.nextLine().split(" ");
        String name3 = string3[0];
        double numDOuble = Double.parseDouble(string3[1]);
        String bankName = string3[2];

        Tuple<String, String, String> tuple1 = new Tuple<>(name, cityPart, town);
        Tuple<String, Integer, Boolean> tuple2 = new Tuple<>(name2, liters, flag);
        Tuple<String, Double, String> tuple3 = new Tuple<>(name3, numDOuble, bankName);
        System.out.println(tuple1.toString());
        System.out.println(tuple2.toString());
        System.out.println(tuple3.toString());
    }
}
