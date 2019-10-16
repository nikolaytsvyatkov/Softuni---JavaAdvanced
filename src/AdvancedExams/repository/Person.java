package AdvancedExams.repository;

public class Person {
    private String name;
    private int age;
    private String birthDate;

    public Person(String name, int age, String birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }
    public String toString() {
        String str = String.format("Name: %s%n",this.name);
        String str1 = String.format("Age: %d%n",this.age);
        String str2 = String.format("Birthday: %s%n",this.birthDate);
        return str + str1 + str2;
    }
}
