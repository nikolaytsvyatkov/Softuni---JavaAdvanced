package MultidimensionalArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int grades = 0;
        int repeatTime = 0;
        if (matcher.find()) {
            grades = Integer.parseInt(matcher.group());
            repeatTime = grades / 90;
        }
        //    System.out.println(grades);

        int maxSize = Integer.MIN_VALUE;
        List<List<Character>> list = new ArrayList<>();
        List<List<Character>> newMatrix = new ArrayList<>();
        String command = input.nextLine();
        while (!command.equals("END")) {
            List<Character> list1 = new ArrayList<>();
            for (int i = 0; i < command.length(); i++) {
                list1.add(command.charAt(i));
            }
            if (maxSize < list1.size()) {
                maxSize = list1.size();
            }
            list.add(list1);
            command = input.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {
            List<Character> currentList = list.get(i);
            if (maxSize - currentList.size() != 0) {
                for (int j =  currentList.size(); j < maxSize; j++) {
                    currentList.add(' ');
                }
                list.set(i, currentList);
            }
        }
        if (grades == 90 || grades % 360 == 90) {
            for (int i = 0; i < maxSize; i++) {
                List<Character> currentList = new ArrayList<>();
                for (int j = 0; j < list.size(); j++) {
                    Character currentChar = list.get(list.size() - 1 - j).get(i);
                    currentList.add(currentChar);

                }
                newMatrix.add(currentList);
            }
            list = newMatrix;
        } else if (grades == 180 || grades % 360 == 180) {
            for (int i = list.size() - 1; i >= 0; i--) {
                List<Character> currentList = new ArrayList<>();
                for (int j = list.get(i).size() - 1; j>=0; j--) {
                    currentList.add(list.get(i).get(j));
                }
                newMatrix.add(currentList);
            }
            list = newMatrix;
        } else if (grades == 270 || grades % 360 == 270) {
            for (int i = 0; i < maxSize; i++) {
                List<Character> currentList = new ArrayList<>();
                for (int j = 0; j < list.size(); j++) {
                    Character currentChar = list.get(j).get(list.get(j).size() - 1 - i);
                    currentList.add(currentChar);

                }
                newMatrix.add(currentList);
            }
            list = newMatrix;
        }
        print(list);


    }
    public static void print(List<List<Character>> list){
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            List<Character> current = list.get(i);
            for (int j = 0; j < current.size(); j++) {
                System.out.print(current.get(j));
            }
            System.out.println();
        }

    }
}
