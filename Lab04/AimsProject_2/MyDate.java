package AimsProject_2;

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
//		Date date = calendar.getTime();
		
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
	
	public MyDate(String day, String month, String year) {
		this.day = getDayFromString(day);
		this.month = getMonthFromString(month);
		this.year = getYearFromString(year);
	}
	
	// method
	
	
	private int getDayFromString(String day) {
		String convertedDay = day.toLowerCase();
		switch(convertedDay) {
		case "first":
			return 1;
		case "second":
			return 2;
		case "third":
			return 3;
		case "fourth":
			return 4;
		case "fifth":
			return 5;
		case "sixth":
			return 6;
		case "seventh":
			return 7;
		case "eighth":
			return 8;
		case "ninth":
			return 9;
		case "tenth":
			return 10;
		case "eleventh":
			return 11;
		case "twelfth":
			return 12;
		case "thirteenth":
			return 13;
		case "fourteenth":
			return 14;
		case "fifteenth":
			return 15;
		case "sixteenth":
			return 16;
		case "seventeenth":
			return 17;
		case "eighteenth":
			return 18;
		case "nineteenth":
			return 19;
		case "twentieth":
			return 20;
		case "twenty-first":
			return 21;
		case "twenty-second":
			return 22;
		case "twenty-third":
			return 23;
		case "twenty-fourth":
			return 24;
		case "twenty-fifth":
			return 25;
		case "twenty-sixth":
			return 26;
		case "twenty-seventh":
			return 27;
		case "twenty-eighth":
			return 28;
		case "twenty-ninth":
			return 29;
		case "thirtieth":
			return 30;
		case "thirty-first":
			return 31;
		default:
			return -1;
		}
	}
	
	private int getMonthFromString(String month) {
		String convertedMonth = month.toLowerCase();
		switch(convertedMonth) {
		case "january":
		case "jan":
			return 1;
		case "february":
		case "feb":
			return 2;
		case "march":
		case "mar":
			return 3;
		case "april":
		case "apr":
			return 4;
		case "may":
			return 5;
		case "june":
		case "jun":
			return 6;
		case "july":
		case "jul":
			return 7;
		case "august":
		case "aug":
			return 8;
		case "september":
		case "sept":
			return 9;
		case "october":
		case "oct":
			return 10;
		case "november":
		case "nov.":
		case "nov":
			return 11;
		case "december":
		case "dec.":
		case "dec":
			return 12;
		default:
			return -1;
		}
	}
	
	private int getYearFromString(String year) {
		String[] tokenYear = year.split(" ");
		
		String strYear = "";
		
		String upperToken = tokenYear[0];
		String lowerToken = tokenYear[1];
		
		if (checkCharInYear(upperToken) == true) {
			strYear += checkUpperToken(upperToken);
			
			if (checkCharInYear(lowerToken) == true) {
				strYear += checkUpperToken(lowerToken);
			} else {
				strYear += getUpperYearFromString(lowerToken);
			}
		} else {
			strYear += getUpperYearFromString(upperToken);
			if (checkCharInYear(lowerToken) == true) {
				strYear += checkUpperToken(lowerToken);
			} else {
				strYear += getUpperYearFromString(lowerToken);
			}
		}
		return Integer.parseInt(strYear);
	}
	
	private String checkUpperToken(String tokenlv0) {
		switch(tokenlv0) {
		case "ten":
			return "10";
		case "eleven":
			return "11";
		case "twelve":
			return "12";
		case "thirteen":
			return "13";
		case "fourteen":
			return "14";
		case "fifteen":
			return "15";
		case "sixteen":
			return "16";
		case "seventeen":
			return "17";
		case "eightteen":
			return "18";
		case "nineteen":
			return "19";
		case "twenty":
			return "20";
		case "thirty":
			return "30";
		case "fourty":
			return "40";
		case "fifty":
			return "50";
		case "sixty":
			return "60";
		case "seventy":
			return "70";
		case "eighty":
			return "80";
		case "ninety":
			return "90";
		default:
			return null;
		}
	}
	
	private String checkLowerToken(String tokenlv1) {
		switch(tokenlv1) {
		case "first":
			return "1";
		case "second":
			return "2";
		case "third":
			return "3";
		case "four":
			return "4";
		case "five":
			return "5";
		case "six":
			return "6";
		case "seven":
			return "7";
		case "eight":
			return "8";
		case "nine":
			return "9";
		default:
			return "-1";
		}
	}
	
	private String getUpperYearFromString(String upperYear) {
		String[] tokenLv1Year = upperYear.split("-");
		
		String strYear = "";
		
		String upperLv1Token = tokenLv1Year[0];
		String lowerLv1Token = tokenLv1Year[1];
		
		strYear += checkUpperToken(upperLv1Token);
		strYear += checkLowerToken(lowerLv1Token);
		
		return strYear;
		
	}
	
	private Boolean checkCharInYear(String strYear) {
		for (int i = 0; i < strYear.length(); i++) {
			if (strYear.charAt(i) == '-') {
				return false;
			}
		}
		return true;
	}
	
	private String getMonthName(int month) {
		String outputMonth = null;
		switch(month) {
		case 1: 
			outputMonth = "Janauary"; 
			break;
        case 2: 
        	outputMonth = "Febuary"; 
        	break;
        case 3: 
        	outputMonth = "March"; 
        	break;
        case 4: 
        	outputMonth = "April"; 
        	break;
        case 5: 
        	outputMonth = "May"; 
        	break;
        case 6: 
        	outputMonth = "June"; 
        	break;
        case 7: 
        	outputMonth = "July"; 
        	break;
        case 8: 
        	outputMonth = "August"; 
        	break;
        case 9: 
        	outputMonth = "September"; 
        	break;
        case 10: 
        	outputMonth = "October"; 
        	break;
        case 11: 
        	outputMonth = "November"; 
        	break;
        case 12: 
        	outputMonth = "December"; 
        	break;
        default:
            System.out.println("Invalid Month");
		}
		return outputMonth;
	}
	
	private String postfixDay(int day) {
		String outputDay = "";
		outputDay += this.day;
		switch(this.day) {
        case 1: case 21: case 31:
        	outputDay += "st"; 
        	break;
        case 2: case 22:
        	outputDay += "nd"; 
        	break;
        case 3:
        	outputDay += "rd"; 
        	break;
        default:
        	outputDay += "th";
        }
		return outputDay;
		
	}
	
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
	
	public void print1() {
		 System.out.println("Date: " + this.month + " / " + this.day + " / " + this.year);
	}
	
	public void print2() {
		String pMonth = getMonthName(this.month);
		String pDay = postfixDay(this.day);
		String pYear = "";
		pYear += this.year;
		
		System.out.printf("%s %s %s\n", pMonth, pDay, pYear);
		
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
