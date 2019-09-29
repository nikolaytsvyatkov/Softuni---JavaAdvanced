package MapAndSet;

import java.util.*;
import java.util.stream.Collectors;

public class HouseOfCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        Set<String> cards = new LinkedHashSet<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        while (!command.equals("JOKER")) {
            String[] strings = command.split(": ");
            String name = strings[0];
            List<String> card = Arrays.stream(strings[1].split(", ")).collect(Collectors.toList());
            cards.addAll(card);
            cards.forEach(e->{
                int score = getScore(e);

                if (!map.containsKey(name)) {
                    map.put(name, score);
                } else {
                    map.put(name, map.get(name) + score);
                }
            });
            cards = new LinkedHashSet<>();
            command = input.nextLine();
        }
        map.entrySet().forEach(e ->{
            System.out.printf("%s: %d%n",e.getKey(),e.getValue());
        });
    }
    static int getScore(String str)  {
        StringBuilder power = new StringBuilder();
        StringBuilder type = new StringBuilder();
        if (str.length() == 3) {
            power.append(str.charAt(0));
            power.append(str.charAt(1));
            type.append(str.charAt(2));
        } else {
            power.append(str.charAt(0));
            type.append(str.charAt(1));
        }
        int score = 0;

            switch (power.toString()) {
                case "J":
                    score += 11;
                    break;
                case "Q":
                    score += 12;
                    break;
                case "K":
                    score += 13;
                    break;
                case "A":
                    score += 14;
                    break;
                default:
                    int n = Integer.parseInt(power.toString());
                    score += n;
            }
        switch (type.toString()) {
            case "S":
                score *= 4;
                break;
            case "H":
                score *= 3;
                break;
            case "D":
                score *= 2;
                break;
            case "C":
                score *= 1;

                break;
        }
        return score;
    }

}
