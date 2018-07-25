
public class Index {
	public static void main(String[] args) {
		String s = "aaaghfaa";
		int ind = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf('a', ind) == -1)
				break;
			System.out.println(s.indexOf('a', ind));
			ind = s.indexOf('a', ind) + 1;
		}
	}
}
