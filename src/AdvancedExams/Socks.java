package AdvancedExams;

import java.util.*;

public class Socks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrLeft = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arrRight = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < arrLeft.length; i++) {
            stack.push(arrLeft[i]);
        }
        for (int i = 0; i < arrRight.length; i++) {
            queue.offer(arrRight[i]);
        }
        List<Integer> list = new ArrayList<>();
       while (queue.size() != 0 || stack.size() != 0) {
           if (stack.size() > 0 && queue.size() > 0) {
               int left = stack.peek();
               int right = queue.peek();
               if (left > right) {
                   list.add(left + right);
                   stack.pop();
                   queue.poll();
               } else if (right > left) {
                    stack.pop();
               } else if (right == left) {
                   queue.poll();
                   int elem = stack.pop() + 1;
                   stack.push(elem);
               }
           }

       }
    }
}
