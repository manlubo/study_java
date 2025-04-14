package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		// 1. 피보나치 수열 출력
		// 반복문 관련
		// 피보나치 수열 숫자 20개 출력
		// 규칙 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속
		// 1 1 2 3 5 8 13 21 44 65 109....
		System.out.println("=========피보나치==========");
		int[] fibo = new int[20]; 
		fibo [0] = 1;
		fibo [1] = 1;
		
		for(int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}

		System.out.println(Arrays.toString(fibo));
		
		
		// 2. 50개의 길이를 가지는 정수 배열 생성, 각 값은 1~20사이의 숫자로 채우기
		// 이후 중복된 값을 제거한 새로운 배열을 생성
		
		int[] list = new int[50];
		for(int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 20 + 1);
		}
		System.out.println(Arrays.toString(list));
		
		
//		for(int i = 0; i < list.length; i++) {
//			for(int j = 0; j < list.length; j++) {
//				if(list[i] == list[j]) {
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(list));		
		
			
			
			
		
		//3. 2차원 배열 
		/* 
		 * **
		 * **
		 * **
		 * *****
		 * *****
		 *       */
		
		char[][] chs= {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
//		// 시계방향으로 90도 회전 결과를 result에 담으시오.
		char[][] result = new char[5][5];
//		
//		
//		
//		System.out.println(Arrays.deepToString(chs));
		
		for(int i = 0; i < chs.length; i++) {
			for(int j = 0; j < chs. length; j++) {
				result[j][i] = chs[j][i];
			}
		}
		System.out.println(Arrays.toString(result[0]));
		System.out.println(Arrays.toString(result[1]));
		System.out.println(Arrays.toString(result[2]));
		System.out.println(Arrays.toString(result[3]));
		System.out.println(Arrays.toString(result[4]));
		

		
		
		
		
		
	}
}
