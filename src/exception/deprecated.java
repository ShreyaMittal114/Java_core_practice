package exception;
import java.util.*;

public class deprecated {

	public static void main(String[] args) {
		Test t = new Test();
		t.old();
	}

	}
	
	
	class Test{
		@Deprecated
		public void old() {
			System.out.println("Old method")		;
			}
	

}
