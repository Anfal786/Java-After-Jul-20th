package jul25th.set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {
	public static void main(String[] args) {
		Set<Object> s = new HashSet<>();
//		s.add(new Employee());
		System.out.println(s.add("MAK"));
		System.out.println(s.add("MAK"));
		System.out.println(s.add("KAM"));

		System.out.println(s.add("SAM"));
		System.out.println(s.add("ANN"));
		System.out.println(s.add("KIM"));
		
		System.out.println(s);//Order depends on Hash Code

		Set<Object> lhs = new LinkedHashSet<>();
		System.out.println(lhs.add("MAK"));
		System.out.println(lhs.add("MAK"));
		System.out.println(lhs.add("KAM"));

		System.out.println(lhs.add("SAM"));
		System.out.println(lhs.add("ANN"));
		System.out.println(lhs.add("KIM"));
		
		System.out.println(lhs);//Order depends on Insertion Order

		Set<Object> ts = new TreeSet<>();
		System.out.println(ts.add("MAK"));
		System.out.println(ts.add("MAK"));
		System.out.println(ts.add("KAM"));

		System.out.println(ts.add("SAM"));
		System.out.println(ts.add("ANN"));
		System.out.println(ts.add("KIM"));
		
		System.out.println(ts);//Order depends on Natural Order
		
	}
}
