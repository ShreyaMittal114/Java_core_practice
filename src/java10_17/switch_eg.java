package java10_17;

public class switch_eg {

	public static void main(String[] args) {
		String day= "mon";
		//new 
		switch(day) {
		case "mon" -> System.out.println("6");
		case "tues" -> System.out.println("7");
		default  -> {
			System.out.println("8");
		    System.out.println("hey");
		}
		}
		String result ="";
		result = switch(day) {
		case "mon" -> "6";
		case "tues" -> "7";
		default  -> "8";
		};
		
		
		//old
		switch(day) {
		case "mon" :{
			System.out.println("6");
			break;
		
		}
		case "tues" :{
			System.out.println("7");
			break;
		
		}
		default  : {
			System.out.println("8");
		    System.out.println("hey");
		}
		
		}
		
		
		String result2 ="";
		result2 = switch(day) {
		case "mon" : yield "6";
		case "tues" :yield "7";
		default  : yield "8";
		};
		System.out.println(result2);

	}

}
