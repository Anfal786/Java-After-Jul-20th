
public class CountC {
	public static void main(String[] args) {
		int count = 0;
		for (int j = 0; j < args.length; j++) {
			for (int i = 0; i < args[j].length(); i++) {
				if (args[j].charAt(i) == 'C')
					count++;
			}
		}
		System.out.println(count);
	}
}
