package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
       String operation = input.nextLine();
       while (!operation.equals("end")) {
           Consumer<int[]> op = consumer(operation);
           op.accept(arr);
           operation = input.nextLine();
       }

    }
    static Consumer<int[]> consumer(String operation)   {
        Consumer<int[]> result;
        switch (operation) {
            case "add":
                result = e ->{
                    for (int i = 0; i < e.length; i++) {
                        e[i] += 1;
                    }
                };
                break;
            case "multiply":
                result = e ->{
                    for (int i = 0; i < e.length; i++) {
                        e[i] *= 2;
                    }
                };
                break;
            case "subtract":
                result = e ->{
                    for (int i = 0; i < e.length; i++) {
                        e[i] -= 1;
                    }
                };
                break;
            case "print":
                    result = e -> Arrays.stream(e).forEach(a -> System.out.print(a + " "));
                    System.out.println();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return result;
    }
}
