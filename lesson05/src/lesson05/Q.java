package lesson05;

import java.util.Scanner;

public class Q {
	public static void main(String[] args) {
//		String str = "1234";
//		String str2 = "1234";
		
		// 문자열 비교
		// str.equals(ste2)
		
		
//		if(str == str2) {
//			System.out.println("같은 문자열");
//		}
		
//		if(str.equals(str2)) {
//			System.out.println("같은 문자열");
//		}
		
		
//		
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine(); // 사용자의 입력을 문자열로 수집
		
		
		//	1. 로그인 인증
		// 사용자로부터 아이디와 비밀번호를 입력 받고
		// 그 아이디가 admin, 비밀번호가 1234일때 로그인 성공
		// 아이디가 admin 비밀번호가 틀렸을때 로그인 실패 > 잘못된 비밀번호
		// 아이디가 admin이 아니면 없는 계정 메세지 출력
		
		
//		System.out.println("아이디를 입력해주세요.");
//		Scanner scanner = new Scanner(System.in);
//		String id = scanner.nextLine();
//		System.out.println("비밀번호를 입력해주세요.");
//		String pw = scanner.nextLine();
//		
//		if (id.equals("admin")) {
//			if(pw.equals("1234")) {
//				System.out.println("로그인 성공");
//			}
//			else {
//				System.out.println("잘못된 비밀번호");
//			}
//		}
//		else {
//			System.out.println("없는 계정입니다.");
//		}
//		
//		if (!id.equals("admin")) {
//			System.out.println("없는 계정입니다.");
//		}
//		else if (pw.equals("1234")) {
//			System.out.println("로그인 성공");
//		}
//		else {
//			System.out.println("잘못된 비밀번호");
//		}
//		
		
		// 2.  숫자 하나를 입력받아서
		// 3의 배수 그리고 짝수여부를 동시판별
		// 3의 배수, 짝수, 3의배수이면서 짝수, 둘다 아닌경우
//		System.out.println("숫자를 입력해주세요.");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		
//		if(num % 2 == 0 || num % 3 == 0) {
//			if(num % 2 == 0 && num % 3 == 0) {	
//				System.out.println("3의 배수이면서 짝수");
//			}
//			else if (num % 2 == 0) {
//				System.out.println("짝수");
//			}
//			else {
//				System.out.println("3의 배수");
//			}
//			
//		}
//		else {
//			System.out.println("둘다 아닙니다.");
//		}
			
		
//		if(num % 2 == 0 && num % 3 == 0) {
//			System.out.println("3의 배수이면서 짝수");
//		}
//		else if(num % 2 == 0) {
//				System.out.println("짝수");
//		}
//		else if(num % 3 == 0) {
//			System.out.println("3의 배수");
//		}
//		else {
//		System.out.println("둘다 아닙니다.");
//		}
		
		// 비트 마스크 플래그
//		boolean 삼의배수 = num % 3 == 0;
//		boolean 짝수 = num % 2 == 0;
//		int result = 0;
//		result = 삼의배수 ? 1:0;
//		result = 짝수 ? 2:0;
//		
//		switch(result) {
//		case 1:
//			num = "3의 배수 ";
//		case 2:
//			num = "3의 배수 ";
//		case 3:
//			num = "3의 배수 ";
//		}
		
		
		// 3. 월(month)을 입력받아서 계절을 출력
		// 예시 3~5월은 봄
		
//		System.out.println("월을 입력해주세요.(ex : 3)");
//		Scanner scannerMonth = new Scanner(System.in);
//		int mon =  scannerMonth.nextInt();
//		
//		
//		switch(mon){
//			case 3: case 4: case 5:
//				System.out.println("봄");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("여름");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("가을");
//				break;
//			case 12: case 1: case 2:
//				System.out.println("겨울");
//				break;
//			default:
//				System.out.println("잘못된 숫자입니다.");
//		}
//		
		
		// 79p 3
//		int colorPen = 5 * 12;
//		int studentCount = 27;
//		
//		System.out.println("인당 " + colorPen / studentCount + "자루 씩 나누어줄 수 있습니다.");
//		System.out.println("연필 " + colorPen % studentCount + "자루가 남습니다.");
		
		// 80p 4
//		int age, height;
//		age = 7;
//		height = 120;
//		boolean parent = false;
//		boolean hearchDeases = false;
//		
//		
//		boolean ruleAge = age >= 6 ; //6세 이상인가?
//		boolean ruleHeight = height >= 120 ; // 키가 120 이상인가
//		boolean canEnter = !hearchDeases && (ruleAge || parent) && ruleHeight;
//		
//		System.out.println(canEnter);
		
		
		// 80p 5
//		int year = 2020;
//		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
//		System.out.println(leapYear);
		
		// 81p 6
//		int price = 187_000;
//		int oman = price / 50000;
//		int ilman = price % 50000 / 10000;
//		int ochun = price  % 10000 / 5000;
//		int ilchun = price % 5000 / 1000;
//		
//		System.out.println("5만원권 : " + oman + "장");
//		System.out.println("1만원권 : " + ilman + "장");
//		System.out.println("5천원권 : " + ochun + "장");
//		System.out.println("1천원권 : " + ilchun + "장");
		
		// 81p 7
//		int  number = 1234;
//		int result = (number / 100 * 100);
//		System.out.println(result);
		
	}
}
