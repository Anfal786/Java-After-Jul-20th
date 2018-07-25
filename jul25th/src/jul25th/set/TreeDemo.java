package jul25th.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {
	public static void main(String[] args) {
		Set<Employee> t = new TreeSet<>();
		t.add(new Employee(5, "Anfal", "KK"));
		t.add(new Employee(6, "MAK", "KK"));
		t.add(new Employee(4, "KAM", "KK"));
		System.out.println(t);
	}
}
