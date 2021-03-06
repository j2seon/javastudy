package pocketmon;
import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
	//포켓몬들의 종류/ 포켓몬이 담겨있는 가방 
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<String, ArrayList<Pokemon>>();

    //해당이름을 가지고 있는 포켓몬 가져오는 메소드
    public ArrayList<Pokemon> getPokemons(String name) {
    	return pokemons.get(name);
    }

    //포켓몬들 추가 
    public void add(Pokemon pokemon) {
    	String name = pokemon.name;
    	//이미있는 이름의 포켓몬이 있는 경우 
    	
    	//없는 경우 
    	if(getPokemons(name)==null) {
    		pokemons.put(name, new ArrayList<Pokemon>());
    	}
    	getPokemons(name).add(pokemon);
    	
    }

    
    //name의 이름을 가진 포켓몬중 cp가 가장큰 포켓몬을 가져오는것
    public Pokemon getStrongest(String name) {
    	ArrayList<Pokemon> pokemonList = getPokemons(name);
    	if(pokemonList==null) {
    		return null;
    	}
		Pokemon strongpoket= null;
		for(Pokemon pokemon : getPokemons(name)) {
			if(strongpoket==null||pokemon.cp>strongpoket.cp) {
				strongpoket=pokemon;
			}
		}
    		return strongpoket;
    }
    
    

    
    //제일 강한 
    public Pokemon getStrongest() {
        Pokemon strongest = null;
       for (String key : pokemons.keySet()) {
            Pokemon p = getStrongest(key);
            if (strongest == null || p.cp > strongest.cp) {
                strongest = p;
            }
        }
		return strongest;

    }
}