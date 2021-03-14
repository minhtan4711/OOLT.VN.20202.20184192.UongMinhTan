package date;

import java.time.*;
import java.util.*;
import java.text.*;

public class MyDate {
	int day;
	int month;
	int year;
	
	// constructor
	public MyDate() {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		this.year = localDate.getYear();
		this.month = localDate.getMonthValue();
		this.day = localDate.getDayOfMonth();
	}
	
	public MyDate(int day, int year, int month) {
		this.day = day;
		this.month = month;
		this.year =year;
	}
	
	public MyDate(String strDate) {
		Date date = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM dd yyyy");
		strDate = dateFormatter.format(date);
	}
	
	// method
	public void print() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  
	}
	
	public void accept() {
		String dateString;
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date with the format dd/MM/yyyy: ");
		dateString = sc.nextLine();
		try {
			df.parse(dateString);
			System.out.println(dateString);
			String[] dateParts = dateString.split("/");
			String sDay = dateParts[0];
			this.day = Integer.parseInt(sDay);
			
			String sMonth = dateParts[1];
			this.month = Integer.parseInt(sMonth);
			
			String sYear = dateParts[2];
			this.year = Integer.parseInt(sYear);
		} catch (ParseException e) {
			System.out.println("Invalid date");
		}
	}
	
	
	
	// getter and setter
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
