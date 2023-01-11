package lab5;

import java.util.ArrayList;

/**
 * Represents a word which consists of list of letters.
 *
 */
public class Word {
	private ArrayList<Letter> word;

	/**
	 * Returns the word.
	 * 
	 * @return List of letters.
	 */
	public ArrayList<Letter> getWord() {
		return word;
	}

	/**
	 * Replaces word with another one.
	 * 
	 * @param word List of letters that makes the word.
	 */
	public void setWord(ArrayList<Letter> word) {
		this.word = word;
	}

	/**
	 * Constructs a word initialized by the specified list.
	 * 
	 * @param word List of letters that makes the word.
	 */
	public Word(ArrayList<Letter> word) {
		this.word = word;
	}

	/**
	 * Constructs a word initialized to the contents of the specified string.
	 * 
	 * @param word The initial content of the word.
	 */
	public Word(String word) {
		this.word = new ArrayList<Letter>();
		for (int i = 0; i < word.length(); i++) { // for every character of the string creates separate object of Letter
													// class
			this.word.add(new Letter(Character.toString(word.charAt(i))));
		}
	}

	/**
	 * Returns a string representation of the object.
	 */
	@Override
	public String toString() {
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < this.word.size(); i++) {// for every letter of the word calls toString() method and appends
													// it result to string builder (final string)
			temp.append(this.word.get(i).toString());
		}
		return temp.toString();
	}

}
