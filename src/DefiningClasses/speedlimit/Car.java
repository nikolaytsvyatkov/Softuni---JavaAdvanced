package DefiningClasses.speedlimit;

public class Car {
    private String model;
    private double fuel;
    private double fuelCostFor1km;
    private int distance;

    public Car(String model, double fuel, double fuelCostFor1km) {
        this.model = model;
        this.fuel = fuel;
        this.fuelCostFor1km = fuelCostFor1km;
        this.distance = 0;
    }

    public double getFuel() {
        return this.fuel;
    }
    public double getFuelCost () {
        return this.fuelCostFor1km;
    }
    public void setFuel (double fuel) {
        this.fuel = fuel;
    }
    public void setDistance(int distance)    {
        this.distance += distance;
    }
    public String toString() {
        String str = String.format("%s %.2f %d",this.model, this.fuel, this.distance);
        return str;
    }
}
