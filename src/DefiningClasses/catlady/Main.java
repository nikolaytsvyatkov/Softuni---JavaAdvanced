package DefiningClasses.catlady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Cat> map = new HashMap<>();
        String[] strings = input.nextLine().split(" ");
        while (!strings[0].equals("End")) {
            Cat cat = null;
            switch (strings[0]) {
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(strings[1], Double.parseDouble(strings[2]));
                    break;
                case "Siamese":
                    cat = new Siamese(strings[1], Double.parseDouble(strings[2]));
                    break;
                case "Cymric":
                    cat = new Cymric(strings[1], Double.parseDouble(strings[2]));
                    break;

            }
            map.put(strings[1], cat);

            strings = input.nextLine().split(" ");
        }
        String name = input.nextLine();
        if (map.containsKey(name)) {
            System.out.println(map.get(name).toString());
        }
    }
}
