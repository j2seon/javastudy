package pocketmon;
import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
	//���ϸ���� ����/ ���ϸ��� ����ִ� ���� 
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<String, ArrayList<Pokemon>>();

    //�ش��̸��� ������ �ִ� ���ϸ� �������� �޼ҵ�
    public ArrayList<Pokemon> getPokemons(String name) {
    	return pokemons.get(name);
    }

    //���ϸ�� �߰� 
    public void add(Pokemon pokemon) {
    	String name = pokemon.name;
    	//�̹��ִ� �̸��� ���ϸ��� �ִ� ��� 
    	
    	//���� ��� 
    	if(getPokemons(name)==null) {
    		pokemons.put(name, new ArrayList<Pokemon>());
    	}
    	getPokemons(name).add(pokemon);
    	
    }

    
    //name�� �̸��� ���� ���ϸ��� cp�� ����ū ���ϸ��� �������°�
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
    
    

    
    //���� ���� 
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