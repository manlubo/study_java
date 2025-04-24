package lesson16;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;

public class RandomToStream {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("int형 난수");
		IntStream is = random.ints(3);
		is.forEach(System.out::println);
		
		System.out.println("===========================");
		is = random.ints(10, 0, 3); // 인트 랜덤
		is.forEach(System.out::println);
		
		System.out.println("long형 난수");
		random.longs(3, 0, 10).forEach(System.out::println);
		
		System.out.println("double형 난수");
		random.doubles(3).forEach(System.out::println);
		
		"ABCD".chars().forEach(i -> System.out.println((char)i));
		
//		Math.max(10d, 5d);
////		DoubleBinaryOperator dbo = (x, y) -> Math.max(x, y);
//		DoubleBinaryOperator dbo = Math::max; // 파라미터의 값이 그대로 사용될 시 메서드 사이 :: 로 생략가능
//		System.out.println(dbo.applyAsDouble(10, 20));
//		BiPredicate<String, String> pre = String :: equals;
//		
////		Function<String, Integer> fn = s -> Integer.parseInt(s);
//		Function<String, Integer> fn = Integer :: parseInt;
//		
////		Function<String, Data> fn2 = s -> new Data(s);
//		Function<String, Data> fn2 = Data :: new;
	}
}

//class Data{
//	String name;
//	public Data(String name) {
//		this.name = name;
//	}
//}