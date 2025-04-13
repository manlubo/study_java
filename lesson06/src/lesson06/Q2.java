package lesson06;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		
		// 크기가 50인 정수배열, 1~20사이의 임의의 값으로 채움
		// 배열에서 중복된 값을 제거한 배열을 생성하고, 결과를 출력
//		int[] list = new int [50];
//		
//		for(int i = 0; i < list.length; i++) {
//			list[i] = (int)(Math.random()*20 + 1);
//		}
//		System.out.println(Arrays.toString(list));
//		
//		int max = 0;
//		int[] count = new int[max];
//		for(int i = 0; i < list.length; i++) {
//			for(int j = 0; j < list.length; j++) {
//				if(list[i] != list[j]) {
//					for(int k = 0; k < count.length; k++) {
//						
//					}
//					
//				}
//			}
//		}
		
		
		
		
		// 8자리 비밀번호 생성
		// 숫자, 대문자, 소문자, 특수문자(!@#$%) 무작위
		// 각종류가 최소 하나씩 포함되도록
//		char[] pw = new char[8];
//		
//		for(int i = 0; i < pw.length; i++) {
//			int ran = (int)(Math.random() * 122 + 1);
//			boolean num = ran >= '0' && ran <= '9';
//			boolean a = ran >= 'a' && ran <= 'z';
//			boolean A = ran >= 'A' && ran <= 'Z';
//			boolean sp = ran == '!' || ran == '@' || ran == '#' || ran == '$' || ran == '%';
//			if (num || a || A || sp) {
//				pw[i] = (char)(ran);				
//			}
//			else {
//				i--;
//			}
//		}
//		System.out.println(Arrays.toString(pw));
		
		
		
		// 마름모 만들기
		
		int max = 5;
		
		for(int i = 1; i <= max; i++) {
			for(int j = 1; j <= i; j++) {
				for(int k = 1; k <= (max - i) / 2 && j == 1; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			i++;
			System.out.println();
		}
	}

}
