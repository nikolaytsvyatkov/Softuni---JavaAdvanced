package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParatheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String str = input.nextLine();
        stack.push(str.charAt(0));
        boolean flag = false;
        for (int i = 1; i < str.length(); i++) {
            if (stack.size() != 0) {
                char element = stack.peek();
                switch (element) {
                    case '{':
                        if (str.charAt(i) == '}') {
                            flag = true;
                            stack.pop();
                        } else {
                            stack.push(str.charAt(i));
                            flag = false;
                            break;
                        }
                        break;
                    case '(' :
                        if (str.charAt(i) == ')') {
                            flag = true;
                            stack.pop();
                        } else {
                            stack.push(str.charAt(i));
                            flag = false;
                            break;
                        }
                        break;
                    case '[' :
                        if (str.charAt(i) == ']') {
                            flag = true;
                            stack.pop();
                        } else {
                            stack.push(str.charAt(i));
                            flag = false;
                            break;
                        }
                        break;
                }
            } else {
                stack.push(str.charAt(i));
                flag = false;
            }

        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
