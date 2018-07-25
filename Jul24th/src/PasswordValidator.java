import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		boolean isNotDone = true;
		Scanner sc=null;
		while (isNotDone) {
			sc = new Scanner(System.in);
			String pass;
			System.out.print("Please Enter the Password: ");
			pass = sc.nextLine();
			boolean isUpp = false, isDig = false, isSpec = false, notWhite = false;
			if (pass.length() < 5 || pass.length() > 10) {
				System.out.println("Length should be between 5 and 10 charecters");
				continue;
			}
			for (Character c : pass.toCharArray()) {
				if (Character.isDigit(c))
					isDig = true;
				else if (Character.isLetter(c)) {
					if (Character.isUpperCase(c))
						isUpp = true;
				} else if (Character.isWhitespace(c))
					notWhite = true;
				else
					isSpec = true;
			}
			if (notWhite)
				System.out.println("Must not have WhiteSpace");
			else if (isDig == false)
				System.out.println("Must Have Digit");
			else if (isUpp == false)
				System.out.println("Must Have one Upper Case Letter");
			else if (isSpec == false)
				System.out.println("Must Have One Special charecter");
			else
			{
				System.out.println("Password is Valid\n THANK YOU!");
				isNotDone=false;
			}
		}
		sc.close();
	}
}
