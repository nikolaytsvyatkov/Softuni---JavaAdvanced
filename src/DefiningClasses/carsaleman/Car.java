package DefiningClasses.carsaleman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String colour;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.colour = "n/a";

    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
        this.colour = "n/a";
    }
    public Car(String model, Engine engine, String colour) {
        this(model, engine);
        this.colour = colour;
        this.weight = 0;
    }

    public Car(String model, Engine engine, int weight, String colour) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
}
