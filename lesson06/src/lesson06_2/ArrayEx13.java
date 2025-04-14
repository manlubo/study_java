package lesson06_2;

import java.util.Arrays;

public class ArrayEx13 {
	public static void main(String[] args) {
		//초기의 배열
		// 5개의 int  배열 생성
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		// 기존 배열의 두배의 길이를 가지는 배열을 생성
		
		int[] tmp = new int[arr.length * 2]; // [0, 0, ... , 0]
		System.out.println(Arrays.toString(tmp));

		
		
		// 배열 내부의 값 복사
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		// 배열의 참조값 복사
		arr = tmp;
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		
		System.arraycopy(arr, 2, tmp, 5, 3);
		System.out.println(Arrays.toString(arr));
		
		// for문을 이용한 복사, arraycopy를 이용한 복사는 복사될 대상을 미리 생성
		
		int[] arr2 = Arrays.copyOf(arr, 20);
		System.out.println(Arrays.toString(arr2));
		
		
		int[] result = {1,2,3};
		
		result = Arrays.copyOf(result, result.length * 2);
		
		System.out.println(Arrays.toString(result));
	}
}
