package student;

public class StudentService {
	Student[] students = new Student[10];

	int man = 0;
	// 등록

	void register() {
		System.out.println("등록 기능");
		students[man] = new Student();
		students[man].no = StudentUtills.nextInt("학번을 입력하세요 : ");
		students[man].name= StudentUtills.nextLine("이름을 입력하세요 : ");
		students[man].kor = StudentUtills.nextInt("국어 점수를 입력하세요 : ");
		students[man].eng = StudentUtills.nextInt("영어점수를 입력하세요 : ");
		students[man].mat = StudentUtills.nextInt("수학점수를 입력하세요 : ");
		man++;
	}
	
	// 조회
	void read() {
		System.out.println("조회 기능");
		int num = StudentUtills.nextInt("학번을 입력하세요 : ");
		for(int i = 0; i < students.length; i++) {
			if(students[i].no == num) {
				System.out.println("학번 : " + students[i].no);
				System.out.println("이름 : " + students[i].name);
				System.out.println("국어 : " + students[i].kor);
				System.out.println("영어 : " + students[i].eng );
				System.out.println("수학 : " + students[i].mat);
				int sum = students[i].kor + students[i].eng  + students[i].mat;
				int avg = sum / 3;
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.println();
				break;
			}
		}
	}
	
	// 수정
	void modify() {
		System.out.println("수정 기능");
	}
	
	// 삭제
	void remove() {
		System.out.println("삭제 기능");
	}
}
