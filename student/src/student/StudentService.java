package student;

import java.util.Arrays;

public class StudentService {
	Student[] students = new Student[2];
	Student[] copy;
	// {null, null ...} 으로 생성됨

	int count = 0;
	
	// 1. 평균 계산
	// 2. 수정 및 삭제 구현
	// 3. 배열 늘리기
	
	// 등록
	void register() {
		System.out.println("등록 기능");
		
		if(count < students.length - 1) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		int no = StudentUtills.nextInt("학번을 입력하세요 : ");
		String name = StudentUtills.nextLine("이름을 입력하세요 : ");
		int kor = StudentUtills.nextInt("국어 점수를 입력하세요 : ");
		int eng = StudentUtills.nextInt("영어점수를 입력하세요 : ");
		int mat = StudentUtills.nextInt("수학점수를 입력하세요 : ");
		students[count++] = new Student(no, name, kor, eng, mat);
	}
	
	// 조회
	void read() {
		System.out.println("조회 기능");	
		for(int i = 0; i < count ; i++) {
			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total() +  ", " + students[i].avg());
//			
		}
	}
	
	// 수정
	void modify() {
		System.out.println("수정 기능");
		int no = StudentUtills.nextInt("수정을 원하시는 학번을 입력하세요 : ");
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				String name = StudentUtills.nextLine("이름을 입력하세요 : ");
				int kor = StudentUtills.nextInt("국어 점수를 입력하세요 : ");
				int eng = StudentUtills.nextInt("영어점수를 입력하세요 : ");
				int mat = StudentUtills.nextInt("수학점수를 입력하세요 : ");
				students[i] = new Student(no, name, kor, eng, mat);
				break;
			}
		}
		
	}
	
	// 삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtills.nextInt("삭제를 원하시는 학번을 입력하세요 : ");
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i , students, i + 1, count - i + 1);
				students[count--] = null;
				break;
			}
		}	
	}
}
