package MapAndSet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        Map<String, String> map = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            String email = input.nextLine();
            String end = email.substring(email.length() - 3);
            if (end.toLowerCase().equals("com") || end.toLowerCase().equals(".us") || end.toLowerCase().equals(".uk")) {
            } else {

                if (!map.containsKey(command)) {
                    map.put(command, email);
                }
            }
            command = input.nextLine();
        }
        map.entrySet().forEach(e ->{
            System.out.printf("%s -> %s%n",e.getKey(), e.getValue());
        });
    }
}
