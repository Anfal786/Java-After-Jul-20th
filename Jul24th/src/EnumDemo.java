enum mak {
	saturday, mak
}

public class EnumDemo {

	public static void main(String[] args) {
		mak[] mm = mak.values();
		for(mak m : mm) {
			System.out.println(m);
		}
		System.out.println(mm.length);
		System.out.println(mak.saturday);
	}
}