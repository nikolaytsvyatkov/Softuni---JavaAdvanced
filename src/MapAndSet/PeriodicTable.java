package MapAndSet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] str = input.nextLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                set.add(str[j]);
            }
        }
        set.forEach(e->{
            System.out.print(e + " ");
        });
    }
}
