package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

import static java.lang.System.*;

public class CalendarEx {
	public static void main(String[] args) {
		
		Calendar cal1 = getInstance();
		Calendar cal2 = new GregorianCalendar();
//		System.out.println(cal1);
		
//		cal1.set(YEAR, 10000);

		
		
		out.println(cal1.get(ERA));
		out.println(cal1.get(YEAR));
		out.println(cal1.get(MONTH));
		out.println(cal1.get(DATE));
		out.println(cal1.get(HOUR));
		out.println(cal1.get(MINUTE));
		out.println(cal1.get(SECOND));
		out.println(cal1.get(DAY_OF_WEEK));
		
		System.out.println(cal1.getActualMaximum(DATE));
		
		
//		cal1.set(0, 0);
		
//		cal1.add(MONTH, -10); // 계산타입에, 를 더해주세요. 다음 값도 변경
		cal1.roll(MONTH, -10); // 계산타입에, 를 더해주세요. 해당 값만 변경
		
		printCal(cal1);
		
	}
	
	static void printCal(Calendar cal) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
	}
	
}
