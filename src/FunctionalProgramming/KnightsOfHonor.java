package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split("\\s+");
        Consumer<String> consumer = e ->{
            String sir = "Sir ";
            sir += e;
            e = sir;
            System.out.println(e);
        };
        Arrays.stream(strings).forEach(e -> consumer.accept(e));
    }
}
