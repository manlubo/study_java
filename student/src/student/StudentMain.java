package student;

public class StudentMain {
	public static void main(String[] args) {
//		// 사용자로부터 문자열 입력을 받고 싶음
//		String str = StudentUtills.nextLine("문자열을 입력하세요 : ");
//		System.out.println(str);
//		
//		
//		// 사용자로부터 숫자를 입력 받고 싶음
//		System.out.println(StudentUtills.nextInt("숫자를 입력하세요 : "));
		
		StudentService service = new StudentService ();
		System.out.println("================= 학생 점수 관리 프로그램 ==================");
		for(int i = 0; i < service.students.length;) {
			switch (StudentUtills.nextInt("1. 등록 2. 조회 3. 수정 4. 삭제 5. 종료")) {
			case 1:
				service.register();
				break;
				
			case 2:
				service.read();
				break;
				
			case 3:
				service.modify();
				break;
				
			case 4:
				service.remove();
				break;
				
			case 5:
				System.out.println("bye~!");
				return;
			default:
				break;
			}
		}
		
		
		
		
	}
}
