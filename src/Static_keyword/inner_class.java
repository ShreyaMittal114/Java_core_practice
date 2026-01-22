package Static_keyword;

public class inner_class {

	public static void main(String[] args) {
		outer.Inner obj = new outer.Inner();
		obj.display();
		/* agar object non static hai to  i.e both class non static
		 *  outer o= new outer();
		 *  outer.Inner i = o.new Inner(); 
		 */
		// if both static outer.Inner.display();

	}

}


class outer{
	static class Inner{
		void display() {
			System.out.println("Static class");
		}
	}
}






//Inner class can be declared static 