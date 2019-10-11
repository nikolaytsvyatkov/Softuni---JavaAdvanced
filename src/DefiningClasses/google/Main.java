package DefiningClasses.google;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Person> map = new LinkedHashMap<>();
        String[] command = input.nextLine().split(" ");

        while (!command[0].equals("End")) {
            if (!map.containsKey(command[0])) {
                switch (command[1]) {
                    case "company":
                        Company company = new Company(command[2],command[3],Double.parseDouble(command[4]));
                     Person person = new Person(command[0],company);
                     map.put(command[0], person);
                        break;
                    case "pokemon":
                        Pokemon pokemon = new Pokemon(command[2],command[3]);
                        Person person1 = new Person(command[0]);
                        person1.getPokemons().add(pokemon);
                        map.put(command[0], person1);

                        break;
                    case "parents":
                        Parent parent = new Parent(command[2],command[3]);
                        Person person2 = new Person(command[0]);
                        person2.getParents().add(parent);
                        map.put(command[0], person2);

                        break;
                    case "children":
                        Children children = new Children(command[2], command[3]);
                        Person person3 = new Person(command[0]);
                        person3.getChildren().add(children);
                        map.put(command[0], person3);

                        break;
                    case "car":
                        Car car = new Car(command[2], Integer.parseInt(command[3]));
                        Person person4 = new Person(command[0],car);
                        map.put(command[0], person4);

                        break;
                }

            } else {
                switch (command[1]) {
                    case "company":
                        Company company = new Company(command[2],command[3],Double.parseDouble(command[4]));

                        map.get(command[0]).setCompany(company);
                        break;
                    case "pokemon":
                        Pokemon pokemon = new Pokemon(command[2],command[3]);
                        map.get(command[0]).getPokemons().add(pokemon);

                        break;
                    case "parents":
                        Parent parent = new Parent(command[2],command[3]);
                       map.get(command[0]).getParents().add(parent);

                        break;
                    case "children":
                        Children children = new Children(command[2], command[3]);

                        map.get(command[0]).getChildren().add(children);

                        break;
                    case "car":
                        Car car = new Car(command[2], Integer.parseInt(command[3]));

                        map.get(command[0]).setCar(car);

                        break;
                }
            }
            command = input.nextLine().split(" ");
        }
        String name = input.nextLine();
        if (map.containsKey(name)) {
            System.out.println(name);
            System.out.println("Company:");
            if (map.get(name).getCompany() != null) {
                System.out.println(map.get(name).getCompany().toString());
            }
            System.out.println("Car:");
            if (map.get(name).getCar() != null) {
                System.out.println(map.get(name).getCar().toString());
            }
            System.out.println("Pokemon:");
            List<Pokemon> pokemons = map.get(name).getPokemons();
            for (int i = 0; i < pokemons.size(); i++) {
                System.out.println(pokemons.get(i).toString());
            }
            System.out.println("Parents:");
            List<Parent> parents = map.get(name).getParents();
            for (int i = 0; i < parents.size(); i++) {
                System.out.println(parents.get(i).toString());
            }
            System.out.println("Children:");
            List<Children> children = map.get(name).getChildren();
            for (int i = 0; i < children.size(); i++) {
                System.out.println(children.get(i).toString());
            }

        }

    }
}
