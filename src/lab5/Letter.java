package lab5;

import java.lang.String;

/**
 * Class that represents a single letter.
 *
 */
public class Letter {
	private String letter;

	/**
	 * Returns the letter.
	 * 
	 * @return String which contains letter.
	 */
	public String getLetter() {
		return letter;
	}

	/**
	 * Replaces the letter with given one.
	 * 
	 * @param letter String with letter you want to set.
	 */
	public void setLetter(String letter) {
		this.letter = letter;
	}

	/**
	 * Constructs a letter initialized to the contents of the specified string.
	 * 
	 * @param letter The initial content of the letter.
	 */
	public Letter(String letter) {
		this.letter = letter;
	}

	/**
	 * Returns a string representation of the object.
	 */
	@Override
	public String toString() {
		return letter;
	}

}
