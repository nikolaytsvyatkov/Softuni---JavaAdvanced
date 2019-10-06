package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFuction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        Function<int[],Integer> func = e ->{
            int min = e[0];
            for (int i = 1; i < e.length; i++){
                if (min > e[i]) {
                    min = e[i];
                }
            }
            return min;
        };
        System.out.println(func.apply(arr));
    }
}
