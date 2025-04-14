package lesson06;

import java.util.Arrays;

public class Ex250411 {
	public static void main(String[] args) {
		// 187000원
		// 1. 50000, 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐의 갯수를 계산
		int[] units = {50000, 10000, 5000, 1000};
		int[] count = new int[units.length];
		int money = 187_000;
		// 이하 코드작성 후 갯수 출력
		
		for(int i = 0;i < units.length; i++) {
			if(money / units[i] != 0) {
			count[i] = money / units[i];
			money %= units[i];
			}
		}
		System.out.println(Arrays.toString(count));
		
		
		
		
		// 2. 임의의 문자열 생성 CAPTCHA 생성
		// 문자열의 범위는 숫자, 영대, 영소 10글자
		char[] A = new char[10];
		char[] a = new char[10];
		char[] num = new char[10];		
		char[] ch = new char[10];
		// A = 65 ~ 90, a = 97 ~ 122, 1 = 48 ~ 57
		for(int i = 0; i < A.length; i++) {
			A[i] = (char)(Math.random() * 26 + 65);
		}
		for(int i = 0; i < a.length; i++) {
			a[i] = (char)(Math.random() * 26 + 97);
		}
		for(int i = 0; i < num.length; i++) {
			num[i] = (char)(Math.random() * 10 + 48);
		}
//		System.out.println(Arrays.toString(A));
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(num));
		
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)((int)(Math.random() * 3) == 0 ? A[i] : ((int)(Math.random() * 3) == 1 ? a[i]: num[i])); 
		}
		System.out.println(Arrays.toString(ch));
		
		
		// 3. 배열에 임의값 채우기
		// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		
		int[] list = new int[100];
		for(int i = 0; i < list.length; i++) {
		list[i] = (int)(Math.random() * 10);
		}
//		System.out.println(Arrays.toString(list));
		// 3-2. 빈도수 구하기
		// 배열의 길이는 10
		int plus = 0;
		int[] count1 = new int[10];		
		for(int i = 0; i < count1.length; i++) {
			for(int j = 0; j < list.length; j++) {
				if(i == list[j]) {
					plus++;
				}
			}
			count1[i] = plus;				
			plus = 0;
		}
		System.out.println(Arrays.toString(count1));
		
		// 교재 연습문제 111p
		//1
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("5의 배수의 합계 : " + sum);
		
		// 2
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합계 : " + evenSum + "홀수의 합계" + oddSum);
		
		// 3
		
		for(int x = 1; x <= 6; x++) {
			for(int y = 1; y <= 6; y++) {
				if(x + y == 6) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		
		//4
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				if (j <= i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		
		//5
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				if (j <= i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//6
		int a1 = 4;
		for(int i = 1; i <= 9; i++) {
			if(i % 2 == 1) {
				for(int j = 1; j <= i; j++) {					
					if(j < 2) {
						for(int k = (10 - i) / 2; k < 9 - i; k++) {
							System.out.print(" ");
						}
					}
					System.out.printf("%s","*");
				}
			System.out.println();
			}
		}
		
		
		// 7
		int check = 0;
		int dice = 0; 
		while(dice != 6) {
			dice = (int)(Math.random() * 6 + 1);
			check++;
		}
		System.out.println("주사위를 굴린 횟수 : " + check);
	}
}
