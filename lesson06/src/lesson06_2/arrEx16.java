package lesson06_2;

import java.util.Arrays;

public class arrEx16 {
	public static void main(String[] args) {
		
		int[] arrInt = {1, 2, 3, 4, 5};
		// index for
		// 배열 내부의 값을 변경 가능
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = arrInt.length - arrInt[i];
			System.out.println(arrInt[i]);
		}
		System.out.println();
		
		// 향상된 for(Enhanced for)
		// 값 변경 불가
		// 읽기 전용
		for(int number : arrInt) {
			number = 10;
			System.out.println(number);
		}
		
		System.out.println(Arrays.toString(arrInt));
		
		
		// index for문으로 확인
		int[][] arr = {{1, 2, 3}, {4, 5}};
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		// 향상 for문으로 확인
		for(int[] tmp : arr) {
			for(int n : tmp) {
				System.out.println(n);
			}
		}
		
		
		
		int age = 30;
		String name = "1234";
		String name2 = "1234";
		String n = new String("1234");
		System.out.println("=================================");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(n);
		System.out.println(name == name2);
		System.out.println(name == n);
		
		System.out.println(name.intern() == n.intern());
		System.out.println(name.equals(n));
	}
}
