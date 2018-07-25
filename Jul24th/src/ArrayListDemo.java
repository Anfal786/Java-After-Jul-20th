import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(5);
		a.add("MAK");
		a.add(0, "TOP");
		
		//Replace
		a.add(a.indexOf("MAK"),"SAM");
		a.remove("MAK");
		
		//Integer i = new Integer(5);
		a.remove((Integer)5);
		
		for(Object o : a) {
			System.out.println(o);
		}
	}
}
