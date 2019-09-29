package MapAndSet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> set = new LinkedHashSet<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0 ;i < n; i++) {
            String str = input.nextLine();
            set.add(str);
        }
        set.forEach(e->{
            System.out.println(e);
        });
    }
}
