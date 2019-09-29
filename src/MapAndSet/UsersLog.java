package MapAndSet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UsersLog   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        Map<String, Map<String, Integer>> map = new TreeMap<>();
        while (!command.equals("end")) {
            String[] strings = command.split(" ");
            String ip = strings[0].substring(3);
            String user = strings[2].substring(5);
            Map<String, Integer> map1 = map.get(user);
            if (map1 == null) {
                map1 = new LinkedHashMap<>();
            }
            if (!map1.containsKey(ip)) {
                map1.put(ip, 1);
            } else {
                map1.put(ip, map1.get(ip) + 1);
            }
            map.put(user, map1);
            command = input.nextLine();
        }

        map.entrySet().forEach(e ->{
            Map<String, Integer> map1 = e.getValue();
            System.out.println(e.getKey()+": ");
            AtomicInteger count = new AtomicInteger(map1.size());
            map1.entrySet().forEach(a->{
                if (count.getAndDecrement() == 1) {
                    System.out.printf("%s => %d.",a.getKey(), a.getValue());
                } else {
                    System.out.printf("%s => %d, ",a.getKey(), a.getValue());
                }


            });
            System.out.println();
        });
    }
}
