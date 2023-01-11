package lab5;

public class ProgramLab5 {

	public static void main(String[] args) {

		String initialText = "Hey, you. You're finally awake.\r\naYou were trying to cross the border,"
				+ " right?\r\nWalked right into that Imperial ambush, same as us, and that thief over there.";
		
		Text text = new Text(initialText);
		text.textTransformation();
		
		System.out.println(text.toString());
	}

}
