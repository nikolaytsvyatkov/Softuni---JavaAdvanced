package MapAndSet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            int qunatity = Integer.parseInt(input.nextLine());
            if (!map.containsKey(command)) {
                map.put(command, qunatity);
            } else {
                map.put(command, map.get(command) + qunatity);
            }
            command = input.nextLine();
        }
        map.entrySet().forEach(e -> {
            System.out.printf("%s -> %d%n",e.getKey(), e.getValue());
        });
    }
}
