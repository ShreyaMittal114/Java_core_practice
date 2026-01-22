package pillars_of_oops;

//to prevent direct access of some members the are wrapped in class- encapsulation

public class encapsulation {

	public static void main(String[] args) {
	      A a = new A();
	      A a2 = new A();
	      a.f1();
	      a.f2();
	      a2.f3();
	      a.f2();

	}

}


class A{
	private int x ; 
	private static int y;
	
	void f1() {
		y=22;   // setter function (public or default)
		x=5;
	}
	
	
	void f2 () {
		System.out.println(x);
		System.out.println(y);
	}
	void f3() {
		y=39;
	}
}
