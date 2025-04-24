package lesson15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumerEx {
	public static void main(String[] args) {
		List<Integer> list = List.of(5, 4, 1, 3, 2);
		
//		Consumer<Integer> con = t -> System.out.println(t);
		
		list.forEach(t -> System.out.println(t));
		// list가 인티저인거 알고
		// forEach에는 컨슈머 타입만 가능하기 때문에 컨슈머 인스턴스 생성없이 가능
		
		
		Map<String, Integer> map = new HashMap<>(Map.of("A", 10, "B", 20));
		System.out.println(map);
		
		map.forEach((k, v) -> System.out.println(k + " :: " + v));
		// 맵. forEach 바이컨슈머 타입만 가능.
		
		DoubleConsumer dc = d -> System.out.println(Math.round(d)); //라운드는 반올림
		dc.accept(10.5); // 
		
		ObjDoubleConsumer<String> odc = (s, d) -> {};
		
		
		Supplier<String> supplier = () -> "12345";
		System.out.println(supplier.get());
		
		// 1 ~ 100 List 스트림 문법
		List<Integer> list2 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
		System.out.println(list2);
		
		
		BiFunction<String, Integer, Boolean> bf = (s, i) -> s.equals(i + "");
		BiPredicate<String, Integer> bp = (s,i) -> s.equals(i + "");
		DoublePredicate dp = d -> d <= 0;
		LongToDoubleFunction ltdf = l -> l * Math.PI;
		
		//입력타입과 반환타입이 동일 - 오퍼레이터
		UnaryOperator<Integer> un = i -> -i; // 하나입력
		
		
		
		
		
		
		
		
	}
}
