
public class ObjectReference {
	int x;
	ObjectReference(){
		System.out.println("This is a constructor");
	}
	
	public static void main(String[] args) {
		ObjectReference obj = new ObjectReference();
		System.out.println(obj.x);
	}
}
