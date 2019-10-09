package DefiningClasses.bankaccount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split(" ");
        Map<Integer, BankAccount> map = new LinkedHashMap<>();
        while (!strings[0].equals("End")) {
            switch (strings[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    map.put(bankAccount.getId(),bankAccount);
                    System.out.printf("Account %s created%n","ID" + bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(strings[1]);
                    if (map.containsKey(id)) {
                        double amount = Double.parseDouble(strings[2]);

                        map.get(id).deposit(amount);
                        System.out.println(String.format("Deposited %.0f to %s",amount, "ID" + map.get(id).getId()));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(strings[1]));
                    break;
                case "GetInterest":
                    if (map.containsKey(Integer.parseInt(strings[1]))) {
                        double interest = map.get(Integer.parseInt(strings[1])).getInterest(1);
                        System.out.println(String.format("%.2f", interest));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
            strings = input.nextLine().split(" ");
        }
    }
}
