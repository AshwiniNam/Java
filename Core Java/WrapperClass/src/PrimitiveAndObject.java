
public class PrimitiveAndObject {

	public static void main(String[] args) {
		int x =5;
		//Primitive to object or boxing
		Integer y = Integer.valueOf(x);
		//object to primitive or unboxing
		int z = y.intValue();
		System.out.println(z);
	}

}
