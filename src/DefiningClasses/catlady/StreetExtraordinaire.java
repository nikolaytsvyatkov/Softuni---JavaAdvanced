package DefiningClasses.catlady;

public class StreetExtraordinaire extends Cat {
    private double meowing;
    public StreetExtraordinaire(String name, double meowing) {
        super(name, meowing);

    }
    @Override
    public String toString() {
        return String.format("StreetExtraordinaire " +super.toString());
    }
}
