package DefiningClasses.carsaleman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, int displacement) {
        this(model,power);
        this.displacement = displacement;
        this.efficiency = "n/a";
    }
    public Engine(String model, int power, String efficiency) {
        this(model,power);
        this.displacement = 0;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
    public String toString() {
        String str1 = String.format("%s: %n",this.model);
        String str2 = String.format("Power: %d%n",this.power);
        String str3 = null;
        if (this.displacement == 0) {
             str3 = String.format("Displacement: n/a%n");
        } else {
             str3 = String.format("Displacement: %d%n", this.displacement);
        }
        String str4 = String.format("Efficiency: %s%n",this.efficiency);
        return String.format(str1 + str2 + str3 + str4);
    }
}
