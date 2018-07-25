package jul25th.set;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeyMapDemo {
	public static void main(String[] args) {
		Map tm = new TreeMap<>();

		tm.put(3, "MAK");
		tm.put(2, "KAM");
		tm.put(5, "SAM");
		tm.put(2, "DAN");

		System.out.println(tm);// Order depends on Hash Code

		System.out.println(tm.get(1));

		Set keys = tm.keySet();

		System.out.println("\nKeys:");
		for (Object o : keys)
			System.out.print(o + "\t");

		System.out.println("\n\nValues:");
		for (Object o : keys)
			System.out.print(tm.get(o) + "\t");
		System.out.println();

		Iterator li = keys.iterator();
		while (li.hasNext()) {
			Object key = li.next();
			System.out.println(key + "-->" + tm.get(key));
		}

		System.out.println("\n" + tm.get(9));// Key Doesn't Exist
	}
}
