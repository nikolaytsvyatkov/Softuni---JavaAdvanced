package Generics.genericbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<Box<Double>> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Double num = Double.parseDouble(input.nextLine());
            Box<Double> box = new Box<>(num);
            boxes.add(box);

        }
        //int[] indexes = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
       // swap(boxes,indexes[0], indexes[1]);
        Double num = Double.parseDouble(input.nextLine());
        int count = count(boxes, num);
        System.out.println(count);
        //boxes.forEach(e -> System.out.println(e.toString()));
    }
    static<T extends Comparable<T>> void  swap(List<Box<T>> list, int index1, int index2) {
        Box<T> temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

    }
    static<T extends Comparable<T>> int count(List<Box<T>> list, T element) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (element.compareTo(list.get(i).getElement()) < 0) {
                count++;
            }
        }
        return count;
    }
}
