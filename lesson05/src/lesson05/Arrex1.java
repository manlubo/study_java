package lesson05;

import java.util.Arrays;

public class Arrex1 {
	public static void main(String[] args) {
		int i = 10;
		// 배열 (array)
		int[] arr = new int[]{10, 20, 30, 50}; //
		
		System.out.println(i);
		
		// 배열의값에 접근 > index
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		arr[0] = 60;
		System.out.println(arr[0]);
		
		arr[1] = arr[2];
		
		arr[3] = i; //{60, 30, 30, 10}
		
		
		
		int[] arr1 = {1, 2, 3 }; // 값
		
		int[] arr2 = new int[3]; // 길이를 통한 초기화
		// {0, 0, 0}
		
		int[] arr3 = new int[] {5, 6, 7, 8};
		
		arr1 = new int[]{10, 40, 50}; // 값 수정을 위해서는 new int[]를 작성해주어야함
		arr1 = new int[10];  // 내부에 0~9번까지의 수가 0으로 생김.{0,0,0,0,0,0,0,0,0,0}
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
		String[] arr4 = new String[3];
		System.out.println(Arrays.toString(arr4));
		
		
		char ch = '가';
		ch = 44032;
//		ch = '\uAC00';		
//		ch = 0xac00;	
		System.out.println(ch);
		
		// 'A' >> 65
		// 'a' >> 97
		// '0' >> 48
	}
}
