
public class NonStaticMembers {
	int num;

	// constructor
	NonStaticMembers() {
		System.out.println("Inside the constructor");
	}

	{
		System.out.println("Inside the non static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMembers();
		new NonStaticMembers();
		new NonStaticMembers();
	}

	static {
		System.out.println("Inside static block");
	}
}
