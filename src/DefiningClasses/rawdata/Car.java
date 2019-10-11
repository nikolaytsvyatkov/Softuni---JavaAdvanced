package DefiningClasses.rawdata;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Engine getEngine() {
        return engine;
    }

    public Car(String model, Engine engine, Cargo cargo) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = new ArrayList<>();
    }
    public void addTire (Tire tire) {
        this.tires.add(tire);
    }
    public Cargo getCargo () {
        return this.cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public String getModel() {
        return model;
    }
}
