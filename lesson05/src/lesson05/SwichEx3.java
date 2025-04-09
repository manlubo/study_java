package lesson05;

import java.util.Random;
import java.util.Scanner;

public class SwichEx3 {
	public static void main(String[] args) {
		System.out.println("가위(1),바위(2),보(3) 중 하나를 선택하세요.");
		Scanner scanner = new Scanner(System.in);
		int me = scanner.nextInt();
		System.out.println(me);
		
		int com = (int)(Math.random() * 3 + 1); // 0이상 1미만의 값 > 0이상 3미만 > 1이상 4미만 > 정수화
		System.out.println(com);
		
		String[] values = {"가위", "바위", "보"};
		System.out.println("내가 낸것 : " + values[me-1] + ", 컴퓨터가 낸것 : " + values[com-1]);
		
		String result = "";
		// switch를 활용해 승리, 패배, 무승부 출력
		switch(me - com) {
		case -2: case 1:
			result = "승리";
			break;
		case -1: case 2:
			result = "패배";
			break;
		default:
			result = "무승부";
		}
		System.out.println(result);
		
		// 0.0 0.0 0.0 
		// 0.1 0.3 0.6
		// 0.2 0.6 1.2
		// 0.3 0.9 1.8
		// 0.4 1.2 2.4
		// 0.5 1.5 3.0
		// 0.6 1.8 3.6
		// 0.7 2.1 4.2
	}
}
