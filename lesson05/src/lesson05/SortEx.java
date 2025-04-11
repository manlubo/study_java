package lesson05;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		// 정렬
		// 버블 정렬
		
		// {3, 4, 1, 5, 2} 첫번째와 두번째 값 비교
		// {3, 4, 1, 5, 2} 두번째와 세번째 값 비교해서 큰 값을 오른쪽으로 이동
		// {3, 1, 4, 5, 2} 세번째와 네번째 값 비교
		// {3, 1, 4, 5, 2} 네번째와 다섯번째 값 비교
		// {3, 1, 4, 2, 5} 이까지 1회차 - 5가 최댓값으로 확정
		
		// {1, 3, 4, 2, 5} 첫번째와 두번째 값 비교
		// {1, 3, 4, 2, 5} 두번째와 세번째 값 비교
		// {1, 3, 2, 4, 5} 이까지 2회차 - 4 확정 
		
		// {1, 3, 2, 4, 5} 두번째와 세번째 값 비교
		// {1, 2, 3, 4, 5} 이까지 3회차 - 3 확정 
		
		// {1, 2, 3, 4, 5} 첫번째와 두번째 값 비교 이까지 4회차 - 전체 확정 
		
		
		
		int[] arr = {5,4,3,2,1};
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.println(i + 1 + "회차");
			for(int j = 0; j < arr.length -1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
	}   
}
