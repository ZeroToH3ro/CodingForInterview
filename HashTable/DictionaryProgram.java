package Progress.HashTable;

import java.util.Map;
import java.util.TreeMap;

public class DictionaryProgram {
    private Map<String, String> mapDictionary = new TreeMap<String, String>();
	
	private String addNewWord(String keyWord, String value) {
		return this.mapDictionary.put(keyWord, value);
	}
	
	private String deleteWord(String keyWord) {
		return this.mapDictionary.remove(keyWord);
	}
	
	private String findMeaningWord(String keyWord) {
		String meanWord = this.mapDictionary.get(keyWord);
		return meanWord;
	}
	
	public int getNumberWord() {
		return this.mapDictionary.size();
	}
	
	public void clearAllWords() {
		this.mapDictionary.clear();
	}
	
	public static void main(String[] args) {
		
	}
}
