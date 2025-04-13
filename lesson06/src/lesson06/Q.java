package lesson06;

import java.util.Arrays;

public class Q {
	public static void main(String[] args) {
		// 3. 배열에 임의값 채우기
				// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
				int[] listNum = new int[100];
				for(int i = 0; i < listNum.length; i++) {
					listNum[i] = (int)(Math.random() * 10);
				}
				System.out.println(Arrays.toString(listNum));
				
				// 3-2. 빈도수 구하기
				// 배열의 길이는 10
				int[] count = new int[10];
				
				for(int i = 0; i < count.length; i++) {
					for(int j = 0; j < listNum.length; j++) {
						if(listNum[j] == i) {
							count[i]++;
						}
					}
				}
				System.out.println(Arrays.toString(count));
				
				
				
				
				
		// 2. 임의의 문자열 생성 CAPTCHA 생성
		// 문자열의 범위는 숫자, 영대, 영소 10글자\
				
				
		char[] list = new char[10];
		
		for(int i = 0; i < list.length; i++) {
			int ran = (int)(Math.random()* 122 + 1);
			boolean a = ran >= 'a' && ran <= 'z';
			boolean A = ran >= 'A' && ran <= 'Z';
			boolean num = ran >= '0' && ran <= '9';
			if(a || A || num) {
				list[i] = (char)ran;
			}
			else {
				i--;
			}
		}
		System.out.println(Arrays.toString(list));
				
				
		// 6
		int max = 9;
		
		for(int i = 1; i <= max; i++) {
			for(int j = 1; j <= i; j++) {
				for(int k = 1; k <= (max - i) / 2 && j == 1; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			i++; // 홀수만 출력하기 위한 
			System.out.println();
		}
		
		
		
		//6-1
		for(int i = max; i >= 0; i--) {
			for(int j = 1; j <= i; j++) {
				for(int k = 1; k <= (max - i) / 2 && j == 1; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			i--;
			System.out.println();
		}
		
		
		
		
		
	}
}
