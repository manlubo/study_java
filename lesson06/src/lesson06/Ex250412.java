package lesson06;

import java.util.Arrays;

public class Ex250412 {
	public static void main(String[] args) {
		// 반복문 사용하지않고 먼저 생각해보기.
		
		
		// 187000원
		// 1. 50000, 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐의 갯수를 계산
		int[] unit = {50000, 10000, 5000, 1000}; // 돈 단위
		int[] count = new int[unit.length]; // 돈 단위 배열 길이만큼 카운트 길이를 설정
		int money = 187_000;// 가진 돈
		
		for (int i = 0; i < unit.length; i++) { // 돈 단위의 길이보다 작을 때, i의 크기를 설정
			count[i] = money / unit[i];
			money %= unit[i];				
		}
		System.out.println(Arrays.toString(count));
		
		// 2. 임의의 문자열 생성 CAPTCHA 생성
		// 문자열의 범위는 숫자, 영대, 영소 10글자
//		char[] list = new char[10];
//		for(int i = 0; i < list.length; i++) {
//			int ran = (int)(Math.random() * 122 + 1);
//			boolean num = ran >= '0' && ran <= '9'; // 숫자일 경우 true
//			boolean A = ran >= 'A' && ran <= 'Z'; // 영어 대문자일 경우 true
//			boolean a = ran >= 'a' && ran <= 'z'; // 영어 소문자일 경우 true
//			if(num || A || a) { // ran이 조건들을 만족하면 실행
//				list[i] = (char)ran;
//			}
//			else { // ran이 조건을 만족하지 않으면 실행
//				i--;
//			}
//		}
//		System.out.println(Arrays.toString(list));
		
		
//		String captcha = ""; // 쌤이푼것
		// 난수의 범위 0~61
		// 0~9 그대로 숫자
		// 10~35 까지는 영대
		// 36이상은 영소
//		for(int i = 0; i < 10; i++) { 
//			int ch = (int)(Math.random() * 62);
//			if(ch < 10) {//tntwk
//				captcha += ch;
//			}
//			else if (ch < 36) { // 영대 10 A 65
//				captcha += (char)(ch + 'A' - 10);
//				
//			}
//			else { // 영대 10 A 65
//				captcha += (char)(ch + 'a' - 36);
//				
//			}
//		}
		
		char[] captcha = new char[10]; // 쌤이푼것
		
		for(int i = 0; i < 10; i++) {
			int ch = (int)(Math.random() * 62);
			if(ch < 10) {//숫자
				captcha[i] = (char)(ch + '0' - 0);
			}
			else if (ch < 36) { // 영대 10 A 65
				captcha[i] = (char)(ch + 'A' - 10);
				
			}
			else { // 영소 36 97
				captcha[i] = (char)(ch + 'a' - 36);
				
			}
		}
		
		
		System.out.println(Arrays.toString(captcha));
		
		// 3. 배열에 임의값 채우기
		// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		int[] listNum = new int[100];
		for(int i = 0; i < listNum.length; i++) {
			listNum[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(listNum));
		
		// 3-2. 빈도수 구하기
		// 배열의 길이는 10
		int[] numCount = new int[10]; // 0 ~ 9의 빈도수를 담는 배열 생성
//		for(int i = 0; i < numCount.length; i++) {
//			for(int j = 0; j < listNum.length; j++) {
//				if (listNum[j] == i) { // listNum의 숫자와 i가 일치할 때, 카운트 증가
//					numCount[i]++;
//				}
//			}
//		}
		
		for(int i = 0; i < listNum.length; i++) { // 쌤이푼것
			numCount[listNum[i]]++;
		}
		
		System.out.println(Arrays.toString(numCount));
		
		// 1
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// 2
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 1; i <= 100; i++){
			if(i % 2 == 1) {
				oddSum += i;
			}
			else {
				evenSum += i;
			}
		}
		System.out.println("홀수의 합계 :" + oddSum);
		System.out.println("짝수의 합계 :" + evenSum);
		
		// 3
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println(i + "," + j);
				}
			}
		}
		
		// 4
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = -2; i < 3; i++) { // 쌤이 푼 방식 (중점을 옮긴다  : 시작숫자 -로)
			for(int j = -2; j < 3; j++) {
				if(i * j < 2 && i * j > -2) {
					System.out.printf("(%2d,%2d)", i, j);
				}
				else {
					System.out.printf("%7c",' ');
				}
			}
			System.out.println();
		}
		
		
		// 5
		for(int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int max = 9;
		
		// 6
		for(int i = 1; i <= max; i++) { //행의 갯수
			for(int j = 1; j <= i; j++) { // j가 i보다 작을때 실행
				for(int k = 1; k <= (max - i) / 2 && j == 1; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		
		
		// 7
		int x = 0; // 주사위 랜덤 값
		int y = 0; // 주사위 횟수 카운트
		while (x != 6) {
			x = (int)(Math.random() * 6 + 1);
			y++;
			System.out.println(x);
		}
		System.out.println("주사위 굴린 횟수 : " + y);
		
	}
}
