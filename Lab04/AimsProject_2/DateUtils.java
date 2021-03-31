package AimsProject_2;



public class DateUtils {
	public static int compare(MyDate d1, MyDate d2) {
		if (d1.getYear() > d2.getYear()) {
			return 1;
		} else if (d1.getYear() > d2.getYear()) {
			return -1;
		} else {
			if (d1.getMonth() > d2.getMonth()) {
				return 1;
			} else if (d1.getMonth() > d2.getMonth()) {
				return -1;
			} else {
				if (d1.getDay() > d2.getDay()) {
					return 1;
				} else if (d1.getDay() < d2.getDay()) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
	
	public static void sortDate(MyDate[] listDate) {
		MyDate tmpDate;
		if (listDate != null && listDate.length >= 1) {
			for (int i = 0; i < listDate.length; i++) {
				for (int j = i + 1; j < listDate.length; j++) {
					if (compare(listDate[i], listDate[j]) > 0) {
						tmpDate = new MyDate(listDate[i].getDay(),listDate[i].getMonth(),listDate[i].getYear());
						listDate[i] = new MyDate(listDate[j].getDay(),listDate[j].getMonth(),listDate[j].getYear());
						listDate[j] = new MyDate(tmpDate.getDay(),tmpDate.getMonth(),tmpDate.getYear());	
					}
				}
			}
		}
	}
}
