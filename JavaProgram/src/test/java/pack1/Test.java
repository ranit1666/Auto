package pack1;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("date="+LocalDate.now());
		String x="2004-12-04";
		SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyy");
		Date date=sim.parse(x);
		Instant instant = date.toInstant();
	      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
	      LocalDate givenDate = zone.toLocalDate();
	      //Calculating the difference between given date to current date.
	      Period period = Period.between(givenDate, LocalDate.now());
		 System.out.println("new date="+period.getYears()); 
		
		 
		 
	}
	
	
}
