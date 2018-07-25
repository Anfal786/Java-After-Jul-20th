package jul25th;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	static void dispList(Collection<Object> c) {
		for (Object i : c)
			System.out.println("From Method: " + i);
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l.add(5);
		l.add(6);
		l.addFirst(4);
		l.addLast(7);
		// for(Integer i : l )
		// System.out.println(i);

		// System.out.println(l);

		// ListIterator it = l.listIterator();
		// while(it.hasNext())
		// System.out.println(it.next());
		//
		// while(it.hasPrevious())
		// System.out.println(it.previous());
		dispList(l);
	}
}
