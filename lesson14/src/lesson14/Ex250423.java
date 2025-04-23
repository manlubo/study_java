package lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ex250423 {
	public static void main(String[] args) {
		// Map을 사용한 문자의 빈도 계산
		Map<String,Integer> map = new HashMap<>();
		String str = "aaaaabbbbcccddddd";
		// {a:5, b:4, c:3, d:5}
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
			
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				map.put("a", a++);
			}
			if(str.charAt(i) == 'b') {
				map.put("b", b++);
			}
			if(str.charAt(i) == 'c') {
				map.put("c", c++);
			}
			if(str.charAt(i) == 'd') {
				map.put("d", d++);
			}
		}
				
		System.out.println(map.entrySet());
		
		
		
	}
}
