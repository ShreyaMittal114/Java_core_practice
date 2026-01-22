package Static_keyword;

public class Area {
	
	public class arr{
		 static void f1() {
			 System.out.println("Area1");
		 }
	}
	
	public class per{
		 static void f2() {
			 System.out.println("Per1");
		 }
	}

	public static void main(String[] args) {
		arr.f1();
		per.f2();
		

	}

}
