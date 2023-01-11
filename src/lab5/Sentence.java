package lab5;

import java.util.ArrayList;

/**
 * Represents a sentence which consists of list of words and punctuation marks.
 *
 */
public class Sentence {
	private ArrayList<Object> sentence;

	/**
	 * Returns the sentence.
	 * 
	 * @return List of Objects (Words and Punctuation) that makes a sentence.
	 */
	public ArrayList<Object> getSentence() {
		return sentence;
	}

	/**
	 * Replaces sentence with another one.
	 * 
	 * @param sentence List of Objects (Words and Punctuation) that creates a
	 *                 sentence.
	 */
	public void setSentence(ArrayList<Object> sentence) {
		this.sentence = sentence;
	}

	/**
	 * Constructs a sentence initialized to the contents of the specified string.
	 * 
	 * @param sentence The initial content of the sentence.
	 */
	public Sentence(String sentence) {
		this.sentence = new ArrayList<Object>();
		String puncMarks = ".!?, :;\r\n";
		String buf = "";
		for (int i = 0; i < sentence.length(); i++) { // for every character of the string input identifies whether it
														// is a punctuation mark or a character of the word and creates
														// separate object of Punctuation class or a Word class
			if (puncMarks.contains(Character.toString(sentence.charAt(i)))) {
				if (buf != "") {
					this.sentence.add(new Word(buf));
				}
				this.sentence.add(new Punctuation(Character.toString(sentence.charAt(i))));
				buf = "";
			} else
				buf += sentence.charAt(i);
		}
	}

	/**
	 * Returns a string representation of the object.
	 */
	@Override
	public String toString() {
		StringBuilder temp = new StringBuilder();
		for (Object item : this.sentence) {
			temp.append(item.toString());
		}
		return temp.toString();
	}
}
