
public class WithoutReverse {
public static void main(String[] args) {
	String s = "Anfal";
	StringBuffer ss = new StringBuffer()	;
	for(int i=s.length()-1;i>=0;i--)
		ss.append(s.charAt(i));
	System.out.println(ss);
}
}
