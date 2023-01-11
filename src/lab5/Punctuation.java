package lab5;

/**
 * Represents a punctuation mark.
 *
 */
public class Punctuation {
	private String symbol;

	/**
	 * Returns punctuation mark.
	 * 
	 * @return String with punctuation mark.
	 */
	public String getPunctuationMark() {
		return symbol;
	}

	/**
	 * Replaces the punctuation mark with another one.
	 * 
	 * @param symbol String with punctuation mark you want to set.
	 */
	public void setPunctuationMark(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * Constructs a punctuation mark initialized to the contents of the specified
	 * string.
	 * 
	 * @param symbol The initial content of the punctuation mark.
	 */
	public Punctuation(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * Returns a string representation of the object.
	 */
	@Override
	public String toString() {
		return this.symbol;
	}
}
