package Progress.HashTable;

import java.util.Map;
import java.util.Scanner;
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
		DictionaryProgram program = new DictionaryProgram();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Enter a new english word:");
			System.out.println("2. Delete a word: ");
			System.out.println("3. Find meaning word:");
			System.out.println("4. The number of words in dictionary: ");
			System.out.println("5. Clear all word: ");
			System.out.println("0. To exit program");
			System.out.println("What is your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1 || choice == 2 || choice == 3) {
				if(choice == 1) {
					System.out.println("Enter a key: ");
					String keyWord = sc.nextLine();
//					sc.nextLine();
					System.out.println("Enter a meaning word: ");
					String meaningWord = sc.nextLine();
					program.addNewWord(keyWord, meaningWord);
				} else if (choice == 2) {
					System.out.println("Enter a key word to delete: ");
					String keyWord = sc.nextLine();
					program.deleteWord(keyWord);
				} else if (choice == 3) {
					System.out.println("Enter a key word to find meaning: ");
					String keyWord = sc.nextLine();
					System.out.println("The meaning: " + program.findMeaningWord(keyWord));
				}
				else if (choice == 4) {
					System.out.println("The number of word in dictionary: " + program.getNumberWord());
				} 
				else if (choice == 5) {
					program.clearAllWords();
					System.out.println("Clear all words completely");
				}
				if (choice == 0) return;
			}
		}while(choice != 0);
	}
}
