
public class CheckAString {
	public static void main(String[] args) {
		String myNumber = "My Number is +45645645";
		for (Character c : myNumber.toCharArray()) {
			System.out.println();
			if (Character.isDigit(c))
				System.out.println(c + " is a Digit");
			else if (Character.isLetter(c)) {
				System.out.println(c + " is a Alphabet and");
				if (Character.isUpperCase(c))
					System.out.print(c + " is a Uppercase Letter\n");
				if (Character.isLowerCase(c))
					System.out.print(c + " is a Lowercase Letter\n");
			} else if (Character.isWhitespace(c))
				System.out.println(c + " is a Whitespace");
			else
				System.out.println(c + " is a Special Charecter");
		}
	}
}
