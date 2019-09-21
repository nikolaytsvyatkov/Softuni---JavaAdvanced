package StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String str = "";
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] commands = input.nextLine().split(" ");
            int num = Integer.parseInt(commands[0]);
            switch (num) {
                case 1:
                    stack.push(str);
                    str += commands[1];
                    break;
                case 2:
                    stack.push(str);
                    StringBuilder sb = new StringBuilder();
                    int count  = Integer.parseInt(commands[1]);
                    for (int j = 0; j < str.length() - count; j++) {
                        sb.append(str.charAt(j));
                    }
                    str = sb.toString();
                    break;
                case 3:
                    int index = Integer.parseInt(commands[1]);
                    System.out.println(str.charAt(index - 1));
                    break;
                case 4:
                    if (stack.size() != 0) {
                        str = stack.pop();
                    }
                    break;
            }
        }

    }

    public static class BasicStackOperation {
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
}
