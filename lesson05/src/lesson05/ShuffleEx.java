package lesson05;

import java.util.Arrays;

public class ShuffleEx {
	public static void main(String[] args) {
		int[] arr = new int[45];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; 
		}// 배열 설정{1~ 45}
		
		for(int i = 0; i < arr.length; i++) {
			int idx = (int)(Math.random() * 45); // idx = 0 ~ 44의 랜덤 숫자
			int tmp = arr[i]; // tmp는 arr[i]
			arr[i] = arr[idx];//
			arr[idx] = tmp;
		}
		
		int[] result = new int[6];
		for(int i = 0 ; i < result.length; i++) {
			result[i] = arr[i];
		}
		System.out.println(Arrays.toString(result));
	}
}
