package AdvancedExams;

import java.util.*;

public class Socks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrLeft = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arrRight = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        ArrayDeque<Integer> leftStack = new ArrayDeque<>();
        ArrayDeque<Integer> RightQueue = new ArrayDeque<>();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrLeft.length; i++) {
            leftStack.push(arrLeft[i]);
        }
        for (int i = 0; i < arrRight.length; i++) {
            RightQueue.offer(arrRight[i]);
        }
        while (leftStack.size() != 0 && RightQueue.size() != 0) {
            int sockLelft = leftStack.peek();
            int sockRight = RightQueue.peek();
            if (sockLelft > sockRight) {
                list.add(sockLelft + sockRight);
                leftStack.pop();
                RightQueue.poll();
            } else if (sockRight > sockLelft) {
                leftStack.pop();
            } else {
                RightQueue.poll();
                int element = leftStack.pop() + 1;
                leftStack.push(element);
            }

        }
        int max = list.stream().max((a, b) -> Integer.compare(a,b)).get();
        System.out.println(max);
        list.forEach(e -> System.out.printf("%d ",e));

    }
}
