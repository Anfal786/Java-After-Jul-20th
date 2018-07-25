
public class StringExp {
	public static void main(String[] args) {
		String s;
		for (long i=1;i<Long.MAX_VALUE;i++) {
			s = ((char)i)+"MAK"+i;
			System.out.println(s);
		}
	}
}
