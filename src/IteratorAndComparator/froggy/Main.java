package IteratorAndComparator.froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = Arrays.stream(input.nextLine().split(", +")).map(Integer::parseInt).collect(Collectors.toList());
        Lake lake = new Lake(list);
        for (int i : lake) {
            if (lake.iterator().hasNext()) {
                System.out.printf("%d, ", i);
           } else {
                System.out.printf("%d", i); }
        }
    }
}
