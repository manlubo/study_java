package lesson16_2;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.ofNullable(null);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println(50);
		}
		
		System.out.println(optional.orElse(20)); // 널일때 기본값을 지정해주는 것
		System.out.println(optional.orElseGet(() -> 30)); 
		
		System.out.println(optional.isPresent()); // 존재한다면 true
		System.out.println(optional.isEmpty()); // 비어있으면 true
		
		optional.ifPresent(System.out::println); /// 존재하면 ~ 해라
		
		optional.orElseThrow(() -> new RuntimeException("값이 없음")); // 예외처리
		
	}

}
