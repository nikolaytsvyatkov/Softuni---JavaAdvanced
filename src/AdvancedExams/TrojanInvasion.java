package AdvancedExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class TrojanInvasion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int waves = Integer.parseInt(input.nextLine());
        int[] defensive = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        ArrayDeque<Integer> queueDefensive = new ArrayDeque<>();
        for (int i = 0 ; i < defensive.length; i++) {
            queueDefensive.offer(defensive[i]);
        }
        for (int i = 1; i <= waves; i++) {
            int[] attack = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            ArrayDeque<Integer> stackWarriours = new ArrayDeque<>() ;
            if (i % 3 == 0) {

            }
            for (int j = 0; j < attack.length; j++) {
                stackWarriours.push(attack[j]);
            }
            if (queueDefensive.size() == 0 && stackWarriours.size() == 0 ) {
                break;
            } else {
                int attackW = stackWarriours.peek();
                int defensiveS = queueDefensive.peek();
                if (attackW > defensiveS) {
                    queueDefensive.poll();
                    attackW -= defensiveS;
                    stackWarriours.pop();
                    stackWarriours.push(attackW);
                } else if (defensiveS > attackW) {
                    queueDefensive.poll();
                    defensiveS -= stackWarriours.pop();
                    queueDefensive.offer(defensiveS);
                } else {
                    queueDefensive.poll();
                    stackWarriours.pop();
                }
            }


        }
    }
}
