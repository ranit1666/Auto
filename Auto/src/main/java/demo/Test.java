package demo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;

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
