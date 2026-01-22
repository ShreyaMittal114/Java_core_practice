package Static_keyword;

public class static_block {
	public static void main(String[] args) {
		System.out.println(Example.value);

	}

}

class Example{
	static int value;
	static {
		value=100; // initialisation
		System.out.println("Executed");
	}
}

//only one public class is allowed per java file and the file name must match public class name 