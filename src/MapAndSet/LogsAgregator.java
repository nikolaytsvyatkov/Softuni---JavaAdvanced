package MapAndSet;

import java.util.*;

public class LogsAgregator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, List<String>> map1 = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] strings = input.nextLine().split(" ");
            String ip = strings[0];
            String name = strings[1];
            int duration = Integer.parseInt(strings[2]);
            if (!map.containsKey(name)) {
                map.put(name, duration);
            } else {
                map.put(name, map.get(name) + duration);
            }
            List<String> list = map1.get(name);
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!list.contains(ip))
                list.add(ip);
            map1.put(name, list);
        }
        map.entrySet().stream().sorted((a, b) -> a.getKey().compareTo(b.getKey())).forEach(e ->{
            List<String> list = map1.get(e.getKey());
             Collections.sort(list);
            System.out.printf("%s: %d [",e.getKey(), e.getValue());
            for (int i = 0 ;i < list.size(); i++) {
                if (i != list.size() - 1) {
                    System.out.printf("%s, ",list.get(i));
                } else {
                    System.out.printf("%s]", list.get(i));
                }
            }
            System.out.println();
        });
    }
}
