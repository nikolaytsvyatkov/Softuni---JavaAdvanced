package DefiningClasses.carsaleman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String[] strings = input.nextLine().split(" ");
            switch (strings.length) {
                case 2:
                    Engine engine = new Engine(strings[0],Integer.parseInt(strings[1]));
                    engines.add(engine);
                    break;
                case 3:
                    Engine engine1 = null;
                    if (Character.isDigit(strings[2].charAt(0))) {
                        engine1 = new Engine(strings[0], Integer.parseInt(strings[1]),Integer.parseInt(strings[2]));
                    } else {
                        engine1 = new Engine(strings[0], Integer.parseInt(strings[1]),strings[2]);
                    }
                    engines.add(engine1);
                    break;
                case 4:
                    Engine engine2 = new Engine(strings[0],Integer.parseInt(strings[1]),Integer.parseInt(strings[2]),strings[3]);
                    engines.add(engine2);
                    break;
            }

        }
        int m = Integer.parseInt(input.nextLine());
        for (int i = 0; i < m; i++){
            String[] command = input.nextLine().split(" ");
            boolean engine = false;
            for (int j = 0; j < engines.size(); j++) {
                if (command[1].equals(engines.get(j).getModel())) {
                    switch (command.length) {
                        case 2:
                            Car car = new Car(command[0],engines.get(j));
                            cars.add(car);
                            break;
                        case 3:
                            if (Character.isDigit(command[2].charAt(0))) {
                                Car car1 = new Car(command[0], engines.get(j), Integer.parseInt(command[2]));
                                cars.add(car1);
                            } else {
                                Car car1 = new Car(command[0], engines.get(j), command[2]);
                                cars.add(car1);
                            }
                            break;
                        case 4:
                            Car car1 = new Car(command[0],engines.get(j), Integer.parseInt(command[2]),command[3]);
                            cars.add(car1);
                            break;
                    }
                    break;
                }
            }

        }
        cars.stream().forEach(e -> {
            System.out.println( e.getModel()+":");
            System.out.print(e.getEngine().toString());
            if (e.getWeight() == 0) {
                System.out.println("Weight: n/a");
            } else {
                System.out.println("Weight: " + e.getWeight());
            }
            System.out.println("Color: " +e.getColour());
        });
    }
}
