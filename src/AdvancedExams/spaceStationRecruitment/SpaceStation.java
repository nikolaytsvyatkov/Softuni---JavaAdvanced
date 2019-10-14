package AdvancedExams.spaceStationRecruitment;



import java.util.ArrayList;
import java.util.List;



public class SpaceStation {
    private String name;
    private int capacity;
    private List<Astronaut> data;

    public SpaceStation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return this.capacity;
    }
    public int getCount() {
        return data.size();
    }
    public void add(Astronaut astronaut) {
        if (this.data.size() + 1 < this.capacity) {
            this.data.add(astronaut);
        }
    }
    public boolean remove(String name) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                this.data.remove(i);
                return true;
            }
        }
        return false;
    }
    public Astronaut getOldestAstronaut() {
        Astronaut max = this.data.get(0);
        for (int i = 1; i < this.getCount(); i++) {
            if (max.getAge() < this.data.get(i).getAge()) {
                max = this.data.get(i);
            }
        }
        return max;
    }
    public Astronaut getAstronaut(String name) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                return this.data.get(i);
            }
        }
        return null;
    }
    public String report() {
        String str = String.format("Astronauts working at Space Station %s:%n", this.name);
        String string = "";
        for (int i = 0; i < this.getCount(); i++) {
            string += String.format("%s%n",this.data.get(i).toString());
        }
        return str + string;
    }
}
