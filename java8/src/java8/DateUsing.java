package java8;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;

public class DateUsing {
	
	public DateUsing()
	{
		super();
	}
	
	/*
	 * This methods show how to get the current time with the now method
	 * it show how to get a duration with between method in the Duration Class
	 */
	public void nowDurationMethodUsing()
	{
		Instant start =Instant.now();
		System.out.println(start);
		Instant end=Instant.now();
		System.out.println(end);
		
		Duration d= Duration.between(start, end);
		System.out.println(d);
		
		//d.plus(2L,TemporalUnit.SECONDS);
	}
}
