package lesson12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		// 오늘 날짜
		Date today = new Date(125, 3, 21);
		
		// 수료 날짜
		Date endDate = new Date(125, 8, 29);
		
		System.out.println(endDate.getTime() - today.getTime());
		
		
		
		long duration = endDate.getTime() - today.getTime();
		System.out.println(duration / 1000 / 60/ 60 / 24);
		
		
		Date birthDay = new Date(96, 9, 30);
		long dura = today.getTime() - birthDay.getTime();
		System.out.println(dura / 1000 / 60/ 60 / 24);
		
	}
}
