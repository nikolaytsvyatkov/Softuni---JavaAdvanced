package DefiningClasses.pokemontrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemonList = new ArrayList<>();
    }
    public int getPokemonListSize () {
        return this.pokemonList.size();
    }
    public String getName() {
        return name;
    }
    public List<Pokemon> getPokemonList() {
        return this.pokemonList;
    }
    public void setNumberOfBadges() {
        this.numberOfBadges += 1;
    }
    public void removePokemon (Pokemon pokemon) {
        this.pokemonList.remove(pokemon );
    }

    public int getNumberOfBadges() {
        return this.numberOfBadges;
    }
}
