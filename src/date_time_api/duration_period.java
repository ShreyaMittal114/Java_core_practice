package date_time_api;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class duration_period {

	public static void main(String[] args) {
		
		
		//instant
		//for hours, min, sec
		Instant start = Instant.now();
		Instant end = Instant.now();
		Duration d1 = Duration.between(start, end);
		TemporalUnit seconds;
		Duration d2 =  Duration.of(3,ChronoUnit.MILLIS);
		int i = d2.compareTo(d1);
		System.out.println(i);
		
		
		//period
		//for long time -dates
		LocalDate  date = LocalDate.now();
		LocalDate mydate = LocalDate.of(1990, 12, 20);
		Period per= Period.between(date, mydate);
		System.out.println(per);
		
	//DateTimeFormatter
		DateTimeFormatter h = DateTimeFormatter.ofPattern("dd//MM/yyyy");
		
		System.out.println(date.format(h));
		
		String dt= "2023-04-24 10:30:45 IST";
		DateTimeFormatter h2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		System.out.println(ZonedDateTime.parse(dt,h2));
		
		
		
		

	}

}
