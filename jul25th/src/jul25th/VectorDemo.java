package jul25th;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(3);
		for(int i=1;i<=14;i++) 
			v.add(5);
		System.out.println(v.capacity());
		System.out.println(v.size());
	}
}
