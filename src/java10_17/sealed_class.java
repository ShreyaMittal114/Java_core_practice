package java10_17;

public class sealed_class {

	public static void main(String[] args) {
		

	}

}


sealed class A permits B{
	
}

sealed class B extends A permits C{   //for class sealed , non-selaed and final
	                                  // for interface sealed and nonsealed
	
}

final class C extends B{
	
}



