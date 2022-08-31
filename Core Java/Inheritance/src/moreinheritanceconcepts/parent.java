package moreinheritanceconcepts;

public class parent {
	int a,b;
	parent(int a,int b){
		this.a=a;
		this.b=b;
	}
	void f1() {
		System.out.println(a+" "+b+" ");
		System.out.println("Inside Parent f1");
	}
}
