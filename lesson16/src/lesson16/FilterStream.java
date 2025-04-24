package lesson16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FilterStream {
	public static void main(String[] args) {
		
		//list 객체 생성
		List<String> list = Arrays.asList("홍길동","김유신","홍길동","이순신","홍길동","유관순");
		
		System.out.println("distinct()");
		list.stream().distinct().forEach(n ->System.out.println(n));
		System.out.println();
		
		System.out.println("filter()");
		list.stream().filter(n -> n.startsWith("홍"))
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("홍"))
		.forEach(n -> System.out.println(n));
		
	}
}
