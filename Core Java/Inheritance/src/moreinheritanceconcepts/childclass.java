package moreinheritanceconcepts;

public class childclass extends superclass{
	public childclass() {
		super();
		System.out.println("no arg child class");
	}
	
	public childclass(int x) {
		this();
		System.out.println("arg child class");
	}
	
	public static void main(String[] args) {
		childclass c = new childclass(10);
	}
}
