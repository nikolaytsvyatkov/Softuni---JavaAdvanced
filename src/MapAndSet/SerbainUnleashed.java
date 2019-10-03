package MapAndSet;

import jdk.dynalink.linker.LinkerServices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerbainUnleashed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        Pattern pattern = Pattern.compile("(?<singer>[A-Za-z ]+)@(?<city>[A-Za-z ]+) (?<price>[\\d]+) (?<count>[\\d]+)");
        Map<String, Map<String, Long>> map = new LinkedHashMap<>();
        while (!command.equals("End")) {
           Matcher matcher = pattern.matcher(command);
           if (matcher.find()) {
               String name = matcher.group("singer");
               if (name.charAt(name.length() - 1) == ' ') {
                  StringBuilder sb = new StringBuilder(name);
                  sb.deleteCharAt(sb.length() - 1);
                  name = sb.toString();
               }

               String city = matcher.group("city");
               int price = (Integer.parseInt( matcher.group("price")));
               int count = (Integer.parseInt( matcher.group("count")));
               Map<String, Long> map1 = map.get(city);
               if (map1 == null) {
                   map1 = new LinkedHashMap<>();
               }
               if (!map1.containsKey(name))  {
                   map1.put(name, (long)(price * count));
               } else {
                   map1.put(name, map1.get(name) + (price * count));
               }
               map.put(city,map1);

           }

            command = input.nextLine();
        }
        map.entrySet().forEach(e->{
            Map<String, Long> map1 = e.getValue();
            System.out.println(e.getKey());
            map1.entrySet().stream().sorted((a, b) -> Long.compare(b.getValue(), a.getValue())).forEach(a ->{
                System.out.printf("#  %s -> %d%n",a.getKey(), a.getValue());
            });
        });
        System.out.println();
    }
}
