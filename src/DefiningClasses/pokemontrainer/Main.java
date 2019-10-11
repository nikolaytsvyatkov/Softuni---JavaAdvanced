package DefiningClasses.pokemontrainer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split(" ");
        Map<String, Trainer> map = new LinkedHashMap<>();
        while (!strings[0].equals("Tournament")) {
            Trainer trainer = null;
            Pokemon pokemon = null ;
            if (!map.containsKey(strings[0])) {
                trainer = new Trainer(strings[0]);

                map.put(trainer.getName(),trainer);
            }
                pokemon = new Pokemon(strings[1],strings[2], Integer.parseInt(strings[3]));
                map.get(strings[0]).getPokemonList().add(pokemon);



            strings = input.nextLine().split(" ");
        }
        String commnad = input.nextLine();
        while (!commnad.equals("End")) {
            for (Map.Entry<String, Trainer> entry : map.entrySet()) {
                List<Pokemon> list = entry.getValue().getPokemonList();
                boolean flag = false;
                for (Pokemon i : list) {
                    if (i.chekElements()) {
                        if (i.getElement().equals(commnad)) {
                            entry.getValue().setNumberOfBadges();
                            flag = true;
                        }
                    }


                }
                if (!flag) {
                    entry.getValue().getPokemonList().stream().forEach(e -> {
                        e.setHealth();

                    });
                }
            }
            commnad = input.nextLine();
        }

        map.entrySet().forEach( e-> {
            List<Pokemon> list = e.getValue().getPokemonList();
           for (int i = 0; i < e.getValue().getPokemonListSize(); i++) {
                if (list.get(i).getHealth() <= 0) {
                    e.getValue().removePokemon(list.get(i));
                    i--;
                }
            }
        });
       map.entrySet().stream().sorted((a,b) ->{
         return Integer.compare(b.getValue().getNumberOfBadges(), a.getValue().getNumberOfBadges());

       }).forEach(e -> {
           System.out.printf("%s %d %d%n",e.getValue().getName(), e.getValue().getNumberOfBadges()
           ,e.getValue().getPokemonListSize());
       });
    }
    static boolean checkElemnts (String command) {
        return command.equals("Electricity") ||
                command.equals("Fire") ||
                command.equals("water");
    }
}
