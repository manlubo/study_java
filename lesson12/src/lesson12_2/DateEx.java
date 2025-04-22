package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yy년 MM월 dd일 E요일 (a) hh시 mm분");
		System.out.println(sf.format(now));
	}
}
