package date_time_api;

import java.time.LocalDate;

public class local_date {

	public static void main(String[] args) {
		LocalDate  date = LocalDate.now();
		System.out.println(date);
		LocalDate mydate = LocalDate.of(1990, 12, 20);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
		System.out.println(mydate.getMonthValue());
		
	     System.out.println( date.minusDays(30));
	     if(date.isLeapYear()) {
	    	 System.out.println("leap year");
	     }
	     else {
	    	 System.out.println("no");
	     }
	     if(date.isAfter(mydate)) {
	    	 System.out.println("future");
	     }

	}

}
