package DefiningClasses.rawdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = input.nextLine().split(" ");
            Engine engine = new Engine(Integer.parseInt(command[1]),Integer.parseInt(command[2]));
            Cargo cargo = new Cargo(Integer.parseInt(command[3]), command[4]);
            Car car = new Car(command[0],engine,cargo);
            Tire tire1 = new Tire(Double.parseDouble(command[5]),Integer.parseInt(command[6]));
            Tire tire2 = new Tire(Double.parseDouble(command[7]),Integer.parseInt(command[8]));
            Tire tire3 = new Tire(Double.parseDouble(command[9]),Integer.parseInt(command[10]));
            Tire tire4 = new Tire(Double.parseDouble(command[11]),Integer.parseInt(command[12]));
            car.addTire(tire1);
            car.addTire(tire2);
            car.addTire(tire3);
            car.addTire(tire4);
            list.add(car);
        }
        String command = input.nextLine();
        if (command.equals("fragile")) {
            list.stream().forEach(e -> {
                if (e.getCargo().getType().equals("fragile")) {
                    List<Tire> tires = e.getTires();
                    for (Tire i : tires) {
                        if (i.getPressure() < 1) {
                            System.out.println(e.getModel());
                            break;
                        }
                    }
                }
            });
        } else {
            list.stream().forEach(e -> {
                if (e.getCargo().getType().equals("flamable")) {

                    if (e.getEngine().getPower() > 250) {
                        System.out.println(e.getModel());
                    }
                }
            });
        }
    }
}
