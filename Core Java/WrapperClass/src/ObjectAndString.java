
public class ObjectAndString {

	public static void main(String[] args) {
		long x = 1000;
		//primitive to object
		Long y = Long.valueOf(x);
		//Object to string
		String s = y.toString();
		//String to object
		Long z = Long.valueOf(s);
	}

}
