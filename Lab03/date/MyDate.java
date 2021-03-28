package date;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	// check valid date
	private int checkDayOfAMonth(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 2 && year % 4 == 0) {
			return 29;
		} else if (month == 2 && year % 4 != 0) {
			return 28;
		} else {
			return 30;
		}
	}
	
	public static int[] extractStringDate(String date) {
		String[] dateParts = date.split(" ");
		int[] validDate = new int[3];
		// check month and setMonth
		switch(dateParts[0].toLowerCase()) {
		case "january":
		case "jan.":
		case "jan":
			validDate[0] = 1;
			break;
		case "february":
		case "feb.":
		case "feb":
			validDate[0] = 2;
			break;
		case "march":
		case "mar.":
		case "mar":
			validDate[0] = 3;
			break;
		case "april":
		case "apr.":
		case "apr":
			validDate[0] = 4;
			break;
		case "may":
			validDate[0] = 5;
			break;
		case "june":
		case "jun":
			validDate[0] = 6;
			break;
		case "july":
		case "jul":
			validDate[0] = 7;
			break;
		case "august":
		case "aug.":
		case "aug":
			validDate[0] = 8;
			break;
		case "september":
		case "sept.":
		case "sept":
			validDate[0] = 9;
			break;
		case "october":
		case "oct.":
		case "oct":
			validDate[0] = 10;
			break;
		case "november":
		case "nov.":
		case "nov":
			validDate[0] = 11;
			break;
		case "december":
		case "dec.":
		case "dec":
			validDate[0] = 12;
			break;
		default:
			System.out.println("Invalid Month");
			break;
		}
		
		// check year and set year
		if (Integer.parseInt(dateParts[2]) < 0) {
			System.out.println("Invalid Year");
		} else {
			validDate[2] = Integer.parseInt(dateParts[2]);
		}
		
		// check day and set day
		String strDay = dateParts[1];
		for (int i = 0; i < strDay.length(); i++) {
			if (strDay.length() == 4) {
				validDate[1] = Integer.parseInt(strDay.substring(0,2));
			} else if (strDay.length() == 3) {
				validDate[1] = Integer.parseInt(strDay.substring(0,1));
			}
		}
		
		return validDate;
	}
	
	// constructor
	public MyDate() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		Date date = calendar.getTime();
		
		this.day = calendar.get(Calendar.DATE);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.year = calendar.get(Calendar.YEAR);
	}
	
	public MyDate(int day, int month, int year) {
		if (day > 0 && day < 32 && month > 0 && month < 13 && year >= 0) {
			setDay(day);
			setMonth(month);
			setYear(year);
		} else if (day <= 0 || day > checkDayOfAMonth(month, year)) {
			System.out.println("Invalid Day");
		} else if (month <= 0 || month > 12) {
			System.out.println("Invalid Month");
		} else if (year < 0) {
			System.out.println("Invalid Year");
		}
		
	}
	
	public MyDate(String date) {
		int[] validDate = extractStringDate(date);
		setDay(validDate[1]);
		setMonth(validDate[0]);
		setYear(validDate[2]);
		
	}
	
	// method
	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the date (February 18th 2019): ");
		String strDate = input.nextLine();
		int[] validDate = extractStringDate(strDate);
		setDay(validDate[1]);
		setMonth(validDate[0]);
		setYear(validDate[2]);
		input.close();
	}
	
	public void print() {
		 System.out.println("Date: " + this.month + " / " + this.day + " / " + this.year);
	}
	
	// getter and setter
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (day > 0 && day < 32) {
			this.day = day;
		} else {
			System.out.println("Invalid Day");
		}
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month >= 1 && month  <= 12) {
			this.month = month;
		} else {
			System.out.println("Invalid Month");
		}
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year > 0) {
			this.year = year;
		} else {
			System.out.println("Invalid Year");
		}
		
	}

}
