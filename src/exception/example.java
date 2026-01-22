package exception;
import java.util.*;

public class example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cb = sc.nextInt();
		int wb = sc.nextInt();
		try {
			if(cb<wb) {
				throw new ArithmeticException("Insufficient balance");
			}
			cb= cb-wb;
			System.out.println("success");
		}
		catch(Exception e1) {
			System.out.println("error"+"+"+e1.getMessage());
		}

	}

}
