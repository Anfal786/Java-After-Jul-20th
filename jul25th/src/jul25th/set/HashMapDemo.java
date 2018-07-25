package jul25th.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map hm = new HashMap<>();

		hm.put(1, "MAK");
		hm.put("2", "KAM");
		hm.put("1", "SAM");
		hm.put(1.0, "KAM");

		System.out.println(hm);// Order depends on Hash Code

		System.out.println(hm.get(1));

		Set keys = hm.keySet();

		System.out.println("\nKeys:");
		for (Object o : keys)
			System.out.print(o + "\t");

		System.out.println("\n\nValues:");
		for (Object o : keys)
			System.out.print(hm.get(o) + "\t");
		System.out.println();

		Iterator li = keys.iterator();
		while (li.hasNext()) {
			String key = li.next().toString();
			System.out.println(key + "-->" + hm.get(key));
		}

		System.out.println("\n" + hm.get(5));// Key Doesn't Exist
	}
}
