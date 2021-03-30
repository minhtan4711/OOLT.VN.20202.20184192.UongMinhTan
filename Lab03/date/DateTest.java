package date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
		MyDate date;
		
		// test 
		int day = 56;
		int month = 6;
		int year = 7053;
		date = new MyDate(day, month, year);
		testMyDateConstructWithIntParam(date, day, month, year);
		
		String strDate;
		strDate = accept();
		date = new MyDate(strDate);
		testMyDateConstructWithStrParam(date, strDate);
	}
	
	// method
	public static String accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the date (February 18th 2019): ");
		String strDate = input.nextLine();
		input.close();
		return strDate;
	}
	
	// test with constructor
	public static void testMyDateConstructWithIntParam(MyDate date, int day, int month, int year) {

		if (day != date.getDay()) {
			System.out.println("Wrong Day");
		} else if (month != date.getMonth()) {
			System.out.println("Wrong Month");
		} else if (year != date.getYear()) {
			System.out.println("Wrong Year");
		} else {
			System.out.println("Correct");
		}
		
	}
	
	public static void testMyDateConstructWithStrParam(MyDate date, String strDate) {
		int[] testDate = new int[3];
//		MyDate tmpDate = new MyDate();
		
		testDate = MyDate.extractStringDate(strDate);
		
		if (testDate[1] != date.getDay()) {
			System.out.println("Wrong Day");
		} else if (testDate[0] != date.getMonth()) {
			System.out.println("Wrong Month");
		} else if (testDate[2] != date.getYear()) {
			System.out.println("Wrong Year");
		} else {
			System.out.println("Correct");
		}
		
	}
}
