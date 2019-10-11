package DefiningClasses.google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Children> children;
    private Car car;
    private Company company;

    public Person(String name, Car car) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents =new ArrayList<>();
        this.children = new ArrayList<>();
        this.car = car;
    }
    public Person(String name, Company company) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents =new ArrayList<>();
        this.children = new ArrayList<>();
        this.company = company;
    }
    public Person(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents =new ArrayList<>();
        this.children = new ArrayList<>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getName() {
        return name;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    public Car getCar() {
        return car;
    }

    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
}
