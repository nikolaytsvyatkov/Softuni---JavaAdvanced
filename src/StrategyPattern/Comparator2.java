package StrategyPattern;

import java.util.Comparator;

public class Comparator2 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getAge() - o2.getAge();
        return result;
    }
}
