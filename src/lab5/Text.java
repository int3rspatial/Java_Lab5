package lab5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents a text which consists of separate sentences.
 *
 */
public class Text {
	private ArrayList<Sentence> text;

	/**
	 * Return the text.
	 * 
	 * @return List of Sentences which makes the text.
	 */
	public ArrayList<Sentence> getText() {
		return text;
	}

	/**
	 * Replaces text with another one.
	 * 
	 * @param text List of Sentences that creates a text.
	 */
	public void setText(ArrayList<Sentence> text) {
		this.text = text;
	}

	/**
	 * Constructs a text initialized to the contents of the specified string.
	 * 
	 * @param text The initial content of the text.
	 */
	public Text(String text) {
		this.text = new ArrayList<Sentence>();
		String[] sentences = Arrays.stream(text.split("[.!?\r\n]")).filter(e -> e.trim().length() > 0)
				.toArray(String[]::new); // splits a text into sentences based on split symbols
											// and deletes empty sentences
		int temp = 0;
		for (int i = 0; i < sentences.length; i++) { // finds punctuation marks from original text which were deleted
														// while
														// splitting into sentences
			temp += sentences[i].length();
			while (".!?\r\n".contains(Character.toString(text.charAt(temp)))) { // adds deleted punctuation marks to the
																				// sentence
				sentences[i] += text.charAt(temp);
				temp++;
				if (temp == text.length()) {
					break;
				}
			}
			this.text.add(new Sentence(sentences[i])); // saves changed sentences to the text
		}
	}

	/**
	 * Transforms the text according to task by variant: Delete every entry of a
	 * letter that is the same as the first in the word.
	 */
	public void textTransformation() {
		for (int i = 0; i < text.size(); i++) {
			ArrayList<Object> buf = text.get(i).getSentence();

			for (int j = 0; j < buf.size(); j++) {

				if (buf.get(j).getClass() == Word.class) {

					Word word = (Word) buf.get(j);
					String firstLetter = word.getWord().get(0).getLetter();
					StringBuilder tempWord = new StringBuilder(firstLetter);
					ArrayList<Letter> letters = word.getWord();

					for (int k = 1; k < letters.size(); k++) {

						String tempLetter = letters.get(k).getLetter();

						if (!firstLetter.equalsIgnoreCase(tempLetter)) {
							tempWord.append(tempLetter);
						}
					}

					buf.set(j, new Word(tempWord.toString()));
				}
			}
			text.get(i).setSentence(buf);
		}
	}

	/**
	 * Returns a string representation of the object.
	 */
	@Override
	public String toString() {
		StringBuilder temp = new StringBuilder();
		for (Object item : this.text) {
			temp.append(item.toString());
		}
		return temp.toString();
	}
}
