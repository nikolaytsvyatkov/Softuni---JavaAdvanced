package IteratorAndComparator.compare;

public class Person1 implements Comparable<Person1>{
    private String name;
    private int age;
    private String town;

    public Person1(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person1 o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.age - o.age;
        }
        if (result == 0) {
            result = this.town.compareTo(o.town);
        }
        return result;
    }
}
