import java.util.*;

public class PokemonRandomizer {

    public static ArrayList<Pokemon> getPokemons(int num){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if(num <= 0)
            return pokemons;
        
        int pokemonNumber = (int)((Math.random()*num)+1);
    
        for(int i=0; i<pokemonNumber;++i){
            int type = (int)(Math.random()*5);
            if(type == 0)
             pokemons.add(new Pikachu("wild Pikachu"));
            else if(type == 1)
                pokemons.add(new Kabigon("wild Kabigon"));
            else if(type == 2)
                pokemons.add(new Evee("wild Evee"));
            else if(type == 3)
                pokemons.add(new Senikame("wild Senikame"));
            else if(type == 4)
                pokemons.add(new Raichu("wild Raichu(evolution)"));
        }
    return pokemons;
    }
}