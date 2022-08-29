package p2;
import p1.A;

public class C extends A{

	public static void main(String[] args) {
		A newobj = new A();
		System.out.println(newobj.d);
		
		C newobj1 = new C();
		System.out.println(newobj1.c);
	}

}
