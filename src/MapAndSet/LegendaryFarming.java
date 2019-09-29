package MapAndSet;

import java.util.Scanner;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        String obtained = "";
        while (true) {
            String str = input.nextLine();
            String[] strings = str.split(" ");
            List<String> material = new ArrayList<>();
            List<Integer> quontity = new ArrayList<>();
            boolean flag = false;

            for (int i = 0; i < strings.length; i+= 2) {
                quontity.add(Integer.parseInt(strings[i]));
                material.add(strings[i+1]);
            }
            for (int i = 0; i < material.size(); i++) {
                if (material.get(i).toLowerCase().equals("shards")) {
                    keyMaterials.put("shards", keyMaterials.get("shards") + quontity.get(i));
                    if (keyMaterials.get("shards") >= 250) {
                        flag = true;
                        obtained = "Shadowmourne";
                        keyMaterials.put("shards", keyMaterials.get("shards") - 250);
                        break;
                    }
                } else if (material.get(i).toLowerCase().equals("fragments")) {
                    if (material.get(i).toLowerCase().equals("fragments")) {
                        keyMaterials.put("fragments", keyMaterials.get("fragments") + quontity.get(i));
                        if (keyMaterials.get("fragments") >= 250) {
                            flag = true;
                            obtained = "Valanyr";

                            keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
                            break;
                        }
                    }
                } else if (material.get(i).toLowerCase().equals("motes")) {
                    if (material.get(i).toLowerCase().equals("motes")) {
                        keyMaterials.put("motes", keyMaterials.get("motes") + quontity.get(i));
                        if (keyMaterials.get("motes") >= 250) {
                            flag = true;
                            obtained = "Dragonwrath";
                            keyMaterials.put("motes", keyMaterials.get("motes") - 250);
                            break;
                        }
                    }
                } else {
                    String string = material.get(i).toLowerCase();
                    if (!junk.containsKey(string)) {
                        junk.put(string, 0);
                    }
                    junk.put(string, junk.get(string) + quontity.get(i));
                }

            }
            if (flag) {
                break;
            }
        }
        System.out.println(obtained + " obtained!");
        keyMaterials.entrySet().stream().sorted((a, b)->{
            int sort = Integer.compare(b.getValue(), a.getValue());
            if (sort == 0) {
                sort =  a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach(a -> System.out.printf("%s: %d%n",a.getKey(),a.getValue()));
        for (Map.Entry<String, Integer> entry1 : keyMaterials.entrySet()) {

        }

        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }




    }
}

