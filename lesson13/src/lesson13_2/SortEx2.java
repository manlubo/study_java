package lesson13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 12, 45, 664, 64, 3, 2, 32));
		l.add(10);
		System.out.println(l);
		
//		l.sort(null);
//		List<Integer> list = new ArrayList<>();
//		System.out.println(list);
//		Comparator<Integer> comparator = new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return (o1 - o2);
//			}
//		};
		
//		l.sort(comparator);
		
		l.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return (o1 - o2);
			}
		});
		
		l.sort((Integer o1, Integer o2) -> {
				// TODO Auto-generated method stub
				return (o1 - o2);
			}
		);

		l.sort((o1, o2) -> o1 - o2);
		
		System.out.println(l);
	}
}
