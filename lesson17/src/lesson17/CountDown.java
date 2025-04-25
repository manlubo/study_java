package lesson17;

import java.util.Comparator;
import java.util.stream.IntStream;

public class CountDown {
	public static void main(String[] args) throws Exception {
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
		IntStream.rangeClosed(1, 10).boxed().sorted(Comparator.reverseOrder()).forEach(i -> { // 람다식 내부에서 예외처리는 람다 내부에서 처리
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}
