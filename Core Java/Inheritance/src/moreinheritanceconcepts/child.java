package moreinheritanceconcepts;

public class child extends parent {
	int c,d;
	child(int a,int b,int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void f1() {
		super.f1();
		System.out.println(c+" "+d);
		System.out.println("Inside child f1");
	}
}
