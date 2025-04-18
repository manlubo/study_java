package student;

import java.util.Arrays;

public class StudentService {
	// 1. 모든 필드, 메서드, 생성자 > 접근제한자
	// 2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료) O
	// 3. 점수값 입력의 범위 0 ~ 100 사이만 인정 O
	// 4. 이름 입력은 한글만 인정, 2글자 ~ 4글자 사이 O 
	// 5. 임시데이터의 점수값을 랜덤으로 배정(60 ~ 100)  O
	
	private int ranscore;
	
	
	private int scoreran() {
		while(true) {
			ranscore = (int)(Math.random() * 100) + 1;
			
			if(ranscore >= 60 && ranscore <= 100) {
				break;
			}
		}
			return ranscore;
	}
	
	
	
	Student[] students = new Student[4];
	Student[] sortedStudents = new Student[students.length];
	// {null, null ...} 으로 생성됨

	int count = 0;
	{
		students[count++] = new Student(1, "김둘리", scoreran(), scoreran(), scoreran());
		students[count++] = new Student(2, "박또치", scoreran(), scoreran(), scoreran());
		students[count++] = new Student(3, "고길동", scoreran(), scoreran(), scoreran());
		students[count++] = new Student(4, "마이콜", scoreran(), scoreran(), scoreran());
		
		sortedStudents = students.clone();
	}
	
	
	
	// 입력 : 학번
	// 출력 : 학생
	// 중복 체크
	private Student findBy(int no) {
		Student student = null;
		for (int i = 0; i < count; i++) {
			if(no == students[i].getNo()) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	
	
	
	
	// 등록
	public void register() {
		System.out.println("==== 등록 기능 ====");
		
		if(count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}
			
			
		int no = StudentUtills.nextInt("학번을 입력하세요 : ");

		Student s = findBy(no);
		if (s != null) {
			System.out.println("중복된 학번이 존재합니다.");
			return;
		}
		
		
		
		String name = StudentUtills.nextLine("이름을 입력하세요 : ");
		
		
		int kor = StudentUtills.nextInt("국어 점수를 입력하세요 : ");
		
		int eng = StudentUtills.nextInt("영어점수를 입력하세요 : ");
		
		int mat = StudentUtills.nextInt("수학점수를 입력하세요 : ");
		

		students[count++] = new Student(no, name, kor, eng, mat);
		sortedStudents = Arrays.copyOf(students, students.length);
	}
	
	
	
	
	
	
	// 조회
	public void read() {
		System.out.println("==== 조회 기능 ====");	
		for(int i = 0; i < count ; i++) {
			System.out.println(students[i].toString());
			
		}
	}
	
	void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}
	
	void print(Student[] stu) {
		for(int i = 0; i < count; i++) {
			System.out.println(stu[i]);
		}
	}
	
	
	
	
	
	
	
	// 수정
	public void modify() {
		System.out.println("==== 수정 기능 ===="); // 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtills.nextInt("수정을 원하시는 학번을 입력하세요 : ");
		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		
		if(no <= 0) {
			System.out.println("0 이하의 값은 학번으로 사용할 수 없습니다.");
			return;
		}
		
		s.setName(StudentUtills.nextLine("이름을 입력하세요 : ")); 
		
		
		s.setKor(StudentUtills.nextInt("국어 점수를 입력하세요 : "));
		
		s.setEng(StudentUtills.nextInt("영어점수를 입력하세요 : "));
		
		s.setMat(StudentUtills.nextInt("수학점수를 입력하세요 : "));
		
		
		
		sortedStudents = Arrays.copyOf(students, students.length);
	}
	
	
	
	
	
	// 삭제
	public void remove() {
		System.out.println("==== 삭제 기능 ====");
		int no = StudentUtills.nextInt("삭제를 원하시는 학번을 입력하세요 : ");
		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		for(int i = 0; i < count ; i++) {
			if(students[i].getNo() == no) {
				System.arraycopy(students, i + 1, students, i ,  count-- - i - 1);
				break;
			}	
		}
	}
	
	
	
	// 과목별 평균
	public void allAvg() {
		System.out.println("==== 과목별 평균 확인 ====");
		double kor = 0; // 국어 평균
		double eng = 0; // 영어 평균
		double mat = 0; // 수학 평균
		for(int i = 0; i < count; i++) {
			kor += students[i].getKor();
			eng += students[i].getEng();
			mat += students[i].getMat();
		}
		kor /= count;
		eng /= count;
		mat /= count;
		
		double avg = (kor + eng + mat) / 3;
		
		System.out.println(count + "명의 학생 평균입니다.");
		System.out.printf("국어 평균 : %.2f", kor);
		System.out.printf(", 영어 평균 : %.2f", eng);
		System.out.printf(", 수학 평균 : %.2f", mat);
		System.out.printf(", 전체 평균 : %.2f\n", avg);
	}
	
	
	
	
	// 석차순 조회
	public void rank() {
		System.out.println("==== 전체 석차 확인 ====");
		
		for(int i= 0; i < count; i++) {
			int idx = i;
			for(int j = 1 + i; j < count; j++) {
				if(sortedStudents[idx].total() < sortedStudents[j].total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents[i];
			sortedStudents[i] = sortedStudents[idx];
			sortedStudents[idx] = tmp;
			
			System.out.println("[ " + (i + 1) + "위 ] " + sortedStudents[i].toString());
			
		}
	}

		
		
	
	
	
	
	
	
}
