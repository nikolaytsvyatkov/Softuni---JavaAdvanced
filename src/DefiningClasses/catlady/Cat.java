package DefiningClasses.catlady;

public class Cat {
    private String name;
    private double specField;

    public Cat(String name, double specField) {
        this.name = name;
        this.specField = specField;
    }
    public String toString() {
        return String.format("%s %.2f",this.name, this.specField);
    }
}
