package q;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		Map<String, Integer> stu = new HashMap<>();
		
		stu.put("김희선",80);
		stu.put("정사랑",80);
		stu.put("전상현",60);
		stu.put("김진태",80);
		
		stu.forEach((t, u) -> System.out.println("이름 : " + t + ", 점수 : " + u));
		
	}
}
