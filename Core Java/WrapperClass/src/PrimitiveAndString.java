
public class PrimitiveAndString {

	public static void main(String[] args) {
		byte x =100;
		//Primitive to String
		String y = Byte.toString(x);
		//String to Primitive
		byte z = Byte.parseByte(y);
	}

}
