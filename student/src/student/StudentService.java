package student;

import java.util.Arrays;

public class StudentService {
	// 1. 모든 필드, 메서드, 생성자 > 접근제한자
	// 2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료)
	// 3. 점수값 입력의 범위 0 ~ 100 사이만 인정
	// 4. 이름 입력은 한글만 인정, 2글자 ~ 4글자 사이
	// 5. 임시데이터의 점수값을 랜덤으로 배정(60 ~ 100)
	
	
	
	Student[] students = new Student[4];
	Student[] sortedStudents = new Student[students.length];
	// {null, null ...} 으로 생성됨

	int count = 0;
	{
		students[count++] = new Student(1, "김둘리", 90, 88, 77);
		students[count++] = new Student(2, "박또치", 45, 80, 85);
		students[count++] = new Student(3, "고길동", 100, 100, 85);
		students[count++] = new Student(4, "마이콜", 16, 100, 85);
		
		sortedStudents = students.clone();
	}
	
	
	
	// 입력 : 학번
	// 출력 : 학생
	Student findBy(int no) {
		Student student = null;
		for (int i = 0; i < count; i++) {
			if(no == students[i].no) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	
	
	
	
	// 등록
	void register() {
		System.out.println("==== 등록 기능 ====");
		
		if(count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}
			
			
		int no = StudentUtills.nextInt("학번을 입력하세요 : ");
//		for (int i = 0; i < count; i++) {
//			if(no == students[i].no) {
//				while(true) {
//					boolean pass = true;
//					int num = StudentUtills.nextInt("중복된 학번입니다. 학번을 다시 입력하세요 : ");
//					for(int j = 0; j < count; j++) {
//						if(num == students[j].no) {
//							pass = false;
//							break;
//						}
//					}
//					if (pass) {
//						no = num;
//						break;
//					}
//				}
//			}
//		}
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
	void read() {
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
	void modify() {
		System.out.println("==== 수정 기능 ===="); // 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtills.nextInt("수정을 원하시는 학번을 입력하세요 : ");
		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		s.name = StudentUtills.nextLine("이름을 입력하세요 : ");
		s.kor = StudentUtills.nextInt("국어 점수를 입력하세요 : ");
		s.eng = StudentUtills.nextInt("영어점수를 입력하세요 : ");
		s.mat = StudentUtills.nextInt("수학점수를 입력하세요 : ");
		sortedStudents = Arrays.copyOf(students, students.length);
	}
	
	// 삭제
	void remove() {
		System.out.println("==== 삭제 기능 ====");
		int no = StudentUtills.nextInt("삭제를 원하시는 학번을 입력하세요 : ");
		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i + 1, students, i ,  count-- - i - 1);
				break;
			}	
		}
	}
	
	
	
	// 과목별 평균
	void allAvg() {
		System.out.println("==== 과목별 평균 확인 ====");
		double kor = 0; // 국어 평균
		double eng = 0; // 영어 평균
		double mat = 0; // 수학 평균
		for(int i = 0; i < count; i++) {
			kor += students[i].kor;
			eng += students[i].eng;
			mat += students[i].mat;
		}
		kor /= count;
		eng /= count;
		mat /= count;
		
		double avg = (kor + eng + mat) / 3;
		
		System.out.print(count + "명의 학생 평균 > ");
		System.out.print("국어 평균 : " + kor);
		System.out.print(", 영어 평균 : " + eng);
		System.out.print(", 수학 평균 : " + mat);
		System.out.println(", 전체 평균 : " + avg);
		
		
		
		
		
		
	}
	
	
	// 석차순 조회
	void rank() {
		System.out.println("==== 전체 석차 확인 ====");
//		copy = students;
//		Student[] copy2 = new Student[count];
//		copy = Arrays.copyOf(copy, count);
//		
//		int countStu = 0;
//		for(int i = 0; i < count; i++) {
//			for(int j = 0; j < count - i; j++) {
//				
//			}
//		}
//		
//		for(int i = 0; i < count; i++) {
//			for(int j = 0; j < count -1 - i; j++) {
//				if (copy[j].avg() < copy[j+1].avg()) {
//					copy2[0] = copy[j];
//					copy[j] = copy[j+1];
//					copy[j+1] = copy2[0];
//				}
//			}
//		}
//		int rank = 1;
//		for(int i = 0; i < count ; i++) {
//			System.out.println("[ " + rank++ + "위 ]" + "\n" + copy[i].toString());
			
		
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
//	public static void main(String[] args) {
//		int[] arr = {5,8,7,1,4,6,2,9,3};
//		
//		// 탐색 n 최소값
//		/*
//		 * 1 3 2 5 4 > 1회차
//		 * 1 2 3 5 4 > 2회차
//		 * 1 2 3 5 4 > 3회차
//		 * 1 2 3 4 5 > 4회차
//		 */
//		for(int i= 0; i <arr.length - 1; i++) {
//			int idx = i;
//			for(int j = 1 + i; j < arr.length; j++) {
//				if(arr[idx] < arr[j]) {
//					idx = j;
//				}
//			}
//			int tmp = arr[i];
//			arr[i] = arr[idx];
//			arr[idx] = tmp;
//			
//			System.out.println(i + 1 + "회차 : " + Arrays.toString(arr));
//		}
		
		
	
	
	
	
	
	
}
