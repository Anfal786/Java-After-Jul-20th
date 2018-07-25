
public class StringComparision {
	public static void main(String[] args) {
		if(args.length<=1) {
			System.out.println("Missing some Argumenst");
			return;
		}			
		if(args[0].equals("Deloitte") && args[1].equals("Deloitte")) 
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
