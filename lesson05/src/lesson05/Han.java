package lesson05;

import java.util.Scanner;

public class Han {
	public static void main(String[] args) {
		//한글의 갯수
		System.out.println('힣' - '가' + 1);//11172
		
		// 초성 당 글자 갯수
		System.out.println('힣' - '하' + 1);//588
		
		// 초성의 갯수
		System.out.println(11172 / 588);
		System.out.println(19 * 588);

		// 중성 당 거리
		System.out.println('개' - '가');//588
		
		
		// 특정 글자가 받침이 있는지 없는지 boolean
		// 있으면 ture, 없으면 false
//		char ch = '가';
//		System.out.println(((ch -'가') % 28 != 0));
		
		
		
		
		//단어를 입력받아 은는이가을를
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String inputStr = scanner.nextLine();
		
		// 문자열의 내의 특정위치의 글자 하나만 char로 변환
		char ch = inputStr.charAt(inputStr.length() - 1);//0이 첫글자
		boolean hasLast = (ch - '가') % 28 != 0;
		
		String output = "사용 단어의 예시는 아래와 같습니다\n";
		output += inputStr + (hasLast ? "은" : "는") + "\n";
		output += inputStr + (hasLast ? "이" : "가") + "\n";
		output += inputStr + (hasLast ? "을" : "를") + "\n";
		
		System.out.println(output);
	}
}
