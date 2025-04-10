package lesson05;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		// 랜덤값 배정 (1~100)
		int value = (int)(Math.random() * 100 +1);
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int count = 0; 
		do {
			System.out.print("1에서 100 사이의 숫자를 입력하세요 : ");
			input = scanner.nextInt();
			if(value < input) {
				System.out.println("Down");
			}
			else if(value > input){
				System.out.println("Up");
			}
			count++;
		} while (value != input);
		
		System.out.println(count + "번째에 당첨");
		
	}
}
