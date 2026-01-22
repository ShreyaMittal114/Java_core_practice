package exception;
import java.util.*;

public class eg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount= sc.nextInt();
		int balance= sc.nextInt();
		try {
			Bank.withdraw(balance, amount);
		}
		catch(InBalance e1){  //specific custom catch
			System.out.println(e1.getMessage());
		}
		catch(Exception e1) {
			System.out.println("System error");
		}
		finally {
			System.out.println("transaction ended");
		}
		

	}

}

// Custom checked exception
class InBalance extends Exception{
	 InBalance(String msg){
		 super(msg);
	 }
}

//logic

class Bank{
	static void withdraw(int balance, int amount)throws InBalance{
		if(amount>balance) {
			throw new InBalance("Insufficient balance");
		}
		System.out.println("success");
		balance-= amount;
		System.out.println("remaining balance "+balance);
	}
}
