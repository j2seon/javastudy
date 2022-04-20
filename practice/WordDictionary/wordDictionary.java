package WordDictionary;

import java.util.HashMap;

public class wordDictionary {

	
	private HashMap<String, String> dictionary = new HashMap<String, String>();
	
	public void addWord(String english, String korean) {
		dictionary.put(english, korean);
	}
	
	public String find(String english) {
		String keyanswer=null;
		for(String key: dictionary.keySet()) {
			if(key.toLowerCase().equals(english.toLowerCase())) {
				return keyanswer=dictionary.get(key);
			}
		}
		return keyanswer;
		
	}
	
	
	
	
	
	
}
