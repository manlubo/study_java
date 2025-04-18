package lesson09_03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Anonymous {
	public static void main(String[] args) {
		// 익명
		Runnable runnable = new Runnable() {
			int i = 10;
			static int si = 20;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("실행");
			}
			void m() {
				System.out.println(i);
			}
			void m2(int i) {
				i = 20;
			}
			
		}; // 클래스의 구간
		
		runnable.run();
//		System.out.println(runnable.i);
//		runnable.m();
		
		Outer outer = new Outer() {
			void m() {
				System.out.println("오버라이드 메서드");
			}
		};
		outer.m();
		
		
		Integer[] arr = {1, 5, 3, 2, 4, 1}; // 정렬하기
		
		Comparator<Integer> iter = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		};
		
		Arrays.sort(arr,iter);// 배열, 정렬규칙 
		System.out.println(Arrays.toString(arr));
		
	}
}
