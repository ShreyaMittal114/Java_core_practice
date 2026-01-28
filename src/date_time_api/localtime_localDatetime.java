package date_time_api;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;
import java.time.*;

public class localtime_localDatetime {

	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		LocalTime t2= LocalTime.now();
	String time = "15:30:45";
	LocalTime t = LocalTime.parse(time);
	System.out.println(t.getHour());
	if(t2.isBefore(LocalTime.now())) {
		System.out.println("future");
	}
	
	
	//localDateTime
	
	   LocalDateTime now=    LocalDateTime.now();
	   LocalDateTime my =  LocalDateTime.parse("2023-01-12T13:48");   //yyyy-mm-ddTHH-mm
	   System.out.println(my);
	  System.out.println(my.compareTo( LocalDateTime.now())); 
	  
	  
	  //zoned datetime
	  System.out.println( ZonedDateTime.now());
	  Set<String> zone= ZoneId.getAvailableZoneIds();
	  zone.forEach(x->System.out.println(x));
	  
	  
	  //instant
	  long curr= System.currentTimeMillis();
	  System.out.println(curr);
	 System.out.println( Instant.now() );
	 
	 Instant noww = Instant.now();
	 
	 
	 
	 
	    
	   
	
	
	

	}

}
