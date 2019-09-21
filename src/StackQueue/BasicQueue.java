package StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int toOffer = arr[0];
        int toPoll = arr[1];
        int isPresent = arr[2];
        for (int i = 0; i < toOffer; i++) {
            queue.offer(arr2[i]);
        }
        while (toPoll != 0) {
            queue.poll();
            toPoll--;
        }
        if (queue.contains(isPresent)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
