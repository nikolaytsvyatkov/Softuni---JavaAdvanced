package StackQueue;



import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int toPush = arr[0];
        int toPop = arr[1];
        int toCheck = arr[2];
        for (int i = 0; i < toPush; i++) {
            stack.push(arr2[i]);
        }
        while (toPop != 0) {
            stack.pop();
            toPop--;
        }
        if (stack.contains(toCheck)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                int min = Integer.MAX_VALUE;
                if (stack.size() != 0) {
                    int num = stack.pop();
                    if (min > num) {
                        min = num;
                    }

                    System.out.println(min);
                }
            }
        }


    }
}
