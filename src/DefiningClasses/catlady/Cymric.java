package DefiningClasses.catlady;

public class Cymric extends Cat {
    private double furLength;
    public Cymric (String name, double furLength) {
        super(name,furLength);
    }

    @Override
    public String toString() {
        return String.format("Cymric " +super.toString());
    }
}
