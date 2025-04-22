package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		String regex = "\\d"; // 숫자
		regex = "[0 ~ 9]"; // 숫자
		regex = "\\D"; // 숫자 아님
		regex = "[^0 ~ 9]"; // 숫자 아님
		
		Pattern p = Pattern.compile("[^A-Za-z]");
		Matcher m;
		
		String[] strs = {"bat", "cat", "bed", "bAt", "Bat", "b", "", "ba", "b0", "0"};
		
		
		for(String a : strs) {
			m = p.matcher(a);
			System.out.println(a + " = " + m.matches());
		}
		
		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-1010-1111";
		System.out.println("p1 : " + p1.matches(tel));
		
		
		System.out.println("abcd1234abcd".replace("a", "e"));
		System.out.println("abcd1234abcd".replaceFirst("a", "e"));
		System.out.println("abcd1234abcd".replaceAll("a{1}", "e"));
	
	}
}
