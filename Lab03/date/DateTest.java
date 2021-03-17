package date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DateTest {
	private MyDate myDate;
	
	@BeforeEach
	public void setUp() throws Exception {
		myDate = new MyDate();
	}
	
	@Test
	@DisplayName("Normal date import")
	public void testGetDay() {
		assertEquals(12, myDate.getDay());
		assertEquals(12, myDate.getDay());
		assertEquals(13, myDate.getDay());
	}
	
	@Test
	@DisplayName("Normal date import")
	public void testGetMonth() {
		assertEquals(12, myDate.getMonth());
		assertEquals(12, myDate.getMonth());
		assertEquals(3, myDate.getMonth());
	}
	
	@Test
	@DisplayName("Normal date import")
	public void testGetYear() {
		assertEquals(1212, myDate.getYear());
		assertEquals(2012, myDate.getYear());
		assertEquals(2021, myDate.getYear());
	}

}
