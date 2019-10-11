package DefiningClasses.speedlimit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Map<String, Car> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] strings = input.nextLine().split(" ");
            Car car = new Car(strings[0], Double.parseDouble(strings[1]), Double.parseDouble(strings[2]));
            if (!map.containsKey(strings[0])) {
                map.put(strings[0], car);
            }
        }
        String command = input.nextLine();
        while (!command.equals("End")) {
            String[] strings = command.split(" ");
            if (map.containsKey(strings[1])) {
                int km = Integer.parseInt(strings[2]);
                if ( map.get(strings[1]).getFuel() - km * map.get(strings[1]).getFuelCost() >= 0) {
                    double currentFuel = map.get(strings[1]).getFuel() - km * map.get(strings[1]).getFuelCost();
                    map.get(strings[1]).setFuel(currentFuel);
                    map.get(strings[1]).setDistance(km);
                } else {
                    System.out.println("Insufficient fuel for the drive");
                }
            }
            command = input.nextLine();
        }
        map.entrySet().forEach(e -> {
            String str = e.getValue().toString();
            System.out.println(str);
        });
        
    }
}
