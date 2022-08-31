package moreinheritanceconcepts;

public class superclass {
	int x;
	public superclass() {
		this(10);
		System.out.println("Super class cons");
	}
	
	public superclass(int x ) {
		this.x = x;
		System.out.println("Arg Super class cons");
	}
}
