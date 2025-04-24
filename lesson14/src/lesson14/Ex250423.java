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

		// 문자열 배열 풀이
		String[] strs = str.split(""); // 문자 배열로 변경
		for (String s : strs) {
			Integer i = map.get(s);
//			if(i == null) {
//				map.put(s, 1);
//			}
//			else {
//				map.put(s, i + 1);
//			}
			map.put(s, i == null ? 1 : i + 1);
		}
		System.out.println(map);
		
//		
//		for(int i = 0; i < str.length(); i++) {
//			String j = String.valueOf(str.charAt(i)); // j에 스트링 하나하나를 담음
//			if(map.containsKey(j)) { // 만약 중복된 키값이 있으면 밸류 값 1  증가   
//				map.put(j, map.get(j) + 1);
//			}
//			else {
//				map.put(j, 1); // 중복 키값 없으면, 밸류 1로 새로 생성
//			}
//		}
//		System.out.println(map.entrySet());
			
		
		
				
		
//		int a = 1;
//		int b = 1;
//		int c = 1;
//		int d = 1;
		
//			if(j.equals("a")) {       처음시도 - 반복구문인데.. 변수필요 ..  굳이???
//				map.put("a", a++);
//			}
//			if(j.equals("b")) {
//				map.put("b", b++);
//			}
//			if(j.equals("c")) {
//				map.put("c", c++);
//			}
//			if(j.equals("d")) {
//				map.put("d", d++);
//			}
		
		
		
	}
}
