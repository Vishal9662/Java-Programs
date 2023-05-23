package updates;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TimeAPI {

	public static void main(String[] args) {
		
		DateAndTime();
		
		ZoneDateAndTime();
		
		PeriodAndDuration();
		
		Use_ChronoUnit();
		
		Use_TemporalAdjustrs();
		
		
	}

	
	public static void Use_TemporalAdjustrs() {
		
		LocalDate currentdate=LocalDate.now();
		System.out.println(currentdate);
		
		LocalDate dayofweek=currentdate.with(TemporalAdjusters.firstDayOfNextMonth());	//here we can also get first day of current month 
		System.out.println("\nFirst day of next month is:- "+dayofweek);
		
		LocalDate nextSunday=currentdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("\nNext Sunday on:- "+nextSunday);
		
		LocalDate lastday=currentdate.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("\nLast day of month is:- "+lastday);
	}

	
	public static void Use_ChronoUnit() {

		//Adding 5 years into current date
		LocalDate currentdate=LocalDate.now();
		System.out.println(currentdate);
		LocalDate addedyear=currentdate.plus(5, ChronoUnit.YEARS);
		System.out.println("\nAfter Adding years, New Date is:- "+addedyear);
		
		//Adding 5 months into current date..
		LocalDate addedmonth=currentdate.plus(5, ChronoUnit.MONTHS);
		System.out.println("\nAfter Adding months, New Date is:- "+addedmonth);
		
		LocalDate addedweek=currentdate.plus(5, ChronoUnit.WEEKS);
		System.out.println("\nAfter Adding weeks, New Date is:- "+addedweek);
		
	}

	public static void ZoneDateAndTime() {
		
		//Get Current Zone..
		ZonedDateTime znd=ZonedDateTime.now();
		System.out.println("\nCurrent Zone is:-  "+znd);

		ZoneId paris=ZoneId.of("Europe/Paris");
		System.out.println(paris);
		
		System.out.println("\nPrint specific zone with current time..");
		ZonedDateTime zdt=znd.withZoneSameInstant(paris);	//this method is used to return a copy of current date-time with different time-zone..
		System.out.println(zdt);
		
	}

	public static void PeriodAndDuration() {
		//Period...
			LocalDate currentdate=LocalDate.now();
			System.out.println(currentdate);
			System.out.println("\nCurrent Date is:-  "+currentdate);
				
			LocalDate givendate=LocalDate.of(2024, Month.JANUARY, 01);
				
			Period gap=Period.between(currentdate, givendate);
			System.out.println("\nGap between current and specified date is:  "+gap);
			
			
			//Duration...
			LocalTime currenttime=LocalTime.now();
			System.out.println(currenttime);
			System.out.println("\nCurrent time is:-  "+currenttime);
			
			Duration add=Duration.ofHours(2);
			System.out.println(add);
		
	}

	public static void DateAndTime() {
		//it gives current date..
		System.out.print("Current date: -> ");
		LocalDate currentdate=LocalDate.now();
		System.out.println(currentdate);
		
		//it gives current time..
		System.out.print("\ncurrent time is: ->  ");
		LocalTime currenttime=LocalTime.now();
		System.out.println(currenttime);
		
		//cureent date and time both
		System.out.print("\nCurrent Date & Time is: -> ");
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		
		//for print in a specific format..
		System.out.print("\nIn our custom format: ->");
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-mm-yyyy, -> hh:mm:ss");
		
		String formatted=dt.format(format);
		System.out.println(formatted);
		
		
		//for print months, days, and seconds..
		System.out.print("\nCurrent Months is: ->   ");
		Month month=dt.getMonth();
		System.out.println(month);
		System.out.println("In Number:  "+dt.getMonthValue());
		
		System.out.print("\nCurrent Day in Current Month:-> ");
		int day=dt.getDayOfMonth();
		System.out.println(day);
		
		System.out.print("\nCurrent Day in Weak:->  ");
		DayOfWeek days=dt.getDayOfWeek();
		System.out.println(days);
		
		System.out.print("\nCurrent Hour:-> ");
		int hour=dt.getHour();
		System.out.println(hour);
		
		System.out.print("\nCurrent Minute:->  ");
		int minute=dt.getMinute();
		System.out.println(minute);
		
		System.out.print("\nCurrent Seconds:->  ");
		int seconds=dt.getSecond();
		System.out.println(seconds);
		
		
		System.out.println("\nPrinting specified date...");
		LocalDate localdate=LocalDate.of(2002, 10, 14);
		System.out.println("My birth date is: "+localdate);
		
		System.out.println("\nPrinting specified date with current time..");
		LocalDateTime ldt=dt.withDayOfMonth(10).withYear(2025);
		System.out.println(ldt);
		
		System.out.println("\nPrinting specified date...");
		LocalDate ldt1=LocalDate.of(2001, Month.JANUARY, 26);
		System.out.println(ldt1);
		
		System.out.println("\nPrinting specified time..");
		LocalTime lt=LocalTime.of(18, 12);
		LocalTime lt1=LocalTime.parse("12:15:21");
		System.out.println(lt);
		System.out.println(lt1);		
	}
}
