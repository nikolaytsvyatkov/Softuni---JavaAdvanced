package DefiningClasses.catlady;

public class Siamese extends Cat {
    private double earSize;
    public Siamese(String name, double earSize) {
        super(name, earSize);

    }
    @Override
    public String toString() {
        return String.format("Siamese " +super.toString());
    }
}
