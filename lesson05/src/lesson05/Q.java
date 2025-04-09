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
//		Scanner scannerID = new Scanner(System.in);
//		String ID = scannerID.nextLine();
//		System.out.println("비밀번호를 입력해주세요.");
//		Scanner scannerPW = new Scanner(System.in);
//		String PW = scannerPW.nextLine();
//		
//		if (ID.equals("admin")) {
//			if(PW.equals("1234")) {
//				System.out.println("로그인 성공");
//			}
//			else {
//				System.out.println("잘못된 비밀번호");
//			}
//		}
//		else {
//			System.out.println("없는 계정입니다.");
//		}
		
		
		
		
		// 2.  숫자 하나를 입력받아서
		// 3의 배수 그리고 짝수여부를 동시판별
		// 3의 배수, 짝수, 3의배수이면서 짝수, 둘다 아닌경우
//		System.out.println("숫자를 입력해주세요.");
//		Scanner scannerNum = new Scanner(System.in);
//		int num = scannerNum.nextInt();
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
			
		
		
		
		
		
		
		
		
		// 3. 월(month)을 입력받아서 계절을 출력
		// 예시 3~5월은 봄
		
		System.out.println("월을 입력해주세요.(ex : 3)");
		Scanner scannerMonth = new Scanner(System.in);
		int mon =  scannerMonth.nextInt();
		
		
		switch(mon){
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
			case 12: case 1: case 2:
				System.out.println("겨울");
				break;
			default:
				System.out.println("잘못된 숫자입니다.");
		}
		
		
		
		
		
	}
}
