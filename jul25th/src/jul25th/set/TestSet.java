package jul25th.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Employee> s =new HashSet<>();
		s.add(new Employee(1,"MAK","FirstOne"));
		s.add(new Employee(1,"MAK","SecondOne"));
		System.out.println(s);
	}
}
