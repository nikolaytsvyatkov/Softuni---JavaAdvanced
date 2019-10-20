package StrategyPattern;

import java.util.Comparator;

public class Compator1 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getName().length() - o2.getName().length();
        if (result == 0) {
            String str1 = String.valueOf(o1.getName().charAt(0));
            String str2 = String.valueOf(o2.getName().charAt(0));
            result = str1.compareToIgnoreCase(str2);
        }
        return result;
    }
}
