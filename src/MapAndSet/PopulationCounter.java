package MapAndSet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String commnad = input.nextLine();
        Map<String, Map<String, Long>> map = new LinkedHashMap<>();
        Map<String, Long> countryMap = new LinkedHashMap<>();
        while (!commnad.equals("report")) {
            String[] strings = commnad.split("\\|");
            String city = strings[0];
            String country = strings[1];
            long population = Long.parseLong(strings[2]);
            Map<String, Long> map1 = map.get(country);
            if (map1 == null) {
                map1 = new LinkedHashMap<>();
            }
            if (!countryMap.containsKey(country)) {
                countryMap.put(country, Long.valueOf(0));
            }
            if (!map1.containsKey(city)) {
                map1.put(city, population);
                countryMap.put(country, countryMap.get(country) + population);
            }
            map.put(country, map1);

            commnad = input.nextLine();
        }
        countryMap.entrySet().stream().sorted((a, b) ->{
           int result = Long.compare(b.getValue(), a.getValue());
            return result;
        }).forEach(e ->{
            Map<String, Long> map1 = map.get(e.getKey());
            System.out.printf("%s (total population: %d)%n",e.getKey(), e.getValue());
            map1.entrySet().stream().sorted((a, b) ->{
                int result = Long.compare(b.getValue(), a.getValue());
                return result;
            }).forEach(a->{
                System.out.printf("=>%s: %d%n",a.getKey(),a.getValue());
            });
        });
    }
}
