package StackQueue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < n; i++) {
            int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int elem = arr[0];
            switch (elem) {
                case 1:
                    stack.push(arr[1]);
                    break;
                case 2:
                    if (stack.size() != 0) {
                        stack.pop();
                    }
                    break;
                case 3:

                    System.out.println(Collections.max(stack));
                    break;

            }
        }
    }
}
