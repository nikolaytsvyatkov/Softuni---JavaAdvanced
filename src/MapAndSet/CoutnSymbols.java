package MapAndSet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CoutnSymbols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Character, Integer> map = new TreeMap<>();
        char[] chars = input.nextLine().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }
        map.entrySet().stream().sorted((a, b) ->
            Character.compare(a.getKey(),b.getKey())).forEach(e -> {
            System.out.printf("%c: %d time/s%n",e.getKey(), e.getValue());
        });

    }
}
