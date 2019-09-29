package MapAndSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int size1 = arr[0];
        int size2 = arr[1];
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
        for (int i = 0 ;i < size1; i++) {
            int n = Integer.parseInt(input.nextLine());
            set.add(n);
        }
       for (int i = 0; i < size2; i++) {
           int n = Integer.parseInt(input.nextLine());
           set1.add(n);
       }
       set.retainAll(set1);
       set.forEach(e->{
           System.out.print(e +" ");
       });


    }
}
