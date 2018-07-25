package jul25th.set;

import java.lang.reflect.Array;
import java.util.*;

public class EndDemo {
//	enum Days {
//		Monday,Tuesday,Wednesday;
//	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(9);
		a.add(15);
		a.add(65);
		a.add(555);
		a.add(15);
		a.add(0);

		System.out.println("At Beginning: " + a);

		System.out.println("MAX: " + Collections.max(a));
		System.out.println("MIN: " + Collections.min(a));
		Collections.shuffle(a);
		System.out.println("After Shuffling: " + a);
		Collections.sort(a);
		System.out.println("After Sorting: " + a);
		System.out.println("Location of 15 in List is: " + Collections.binarySearch(a, 15));
		ArrayList<Integer> b = new ArrayList<>(a);
		System.out.println("Contents of B after Copying from A: " + b);
		Collections.fill(a, 5);
		System.out.println("After Filling: " + a);
		
		Enumeration<Integer> e = Collections.enumeration(b);
		
		a=Collections.list(e);
		System.out.println("After Enumeration: "+a);
	}
}
