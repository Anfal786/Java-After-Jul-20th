
public class WrapperClassDemo {
	public static void main(String[] args) {
		int k=8000;
		Integer aa = new Integer(k);
		System.out.println(aa.MAX_VALUE);
		System.out.println(aa.MIN_VALUE);
		System.out.println(aa.SIZE);
		k = (int)aa;
		Double d = new Double(3.45);
		System.out.println(d.doubleValue()+" \nInt:"+d.intValue());
		System.out.println(Integer.toHexString(k));
	}
}
