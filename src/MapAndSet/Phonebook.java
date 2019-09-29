package MapAndSet;

import com.sun.jdi.event.StepEvent;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> map = new LinkedHashMap<>();
        while (true) {
            String command = input.nextLine();
            if (command.equals("search"))    {
                break;
            }
            String[] str = command.split("-");
            String name = str[0];
            String phone = str[1];
            if (!map.containsKey(name)) {
                map.put(name, phone);
            } else {
                map.put(name, phone);
            }

        }
        while (true) {
            String command = input.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (map.containsKey(command)) {
                System.out.printf("%s -> %s%n",command, map.get(command));
            } else {
                System.out.printf("Contact %s does not exist.%n",command);
            }
        }
    }
}
