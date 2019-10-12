package WorkShop1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();
        int n = 4;
        for (int i = 0; i < n; i++) {
            smartArray.add(i);
        }
        smartArray.add(0,100);
        System.out.println();

    }
}
