package student;

import java.util.Arrays;

public class StudentService {
	Student[] students = new Student[2];
	Student[] copy;
	// {null, null ...} 으로 생성됨

	int count = 0;
	{
		students[count++] = new Student(1, "개똥이", 90, 88, 77);
		students[count++] = new Student(2, "고길동", 100, 100, 85);
	}
	// 1. 중복학생 방지 O
	// 2. 과목당 평균값 출력 + 총 평균 O
	// 3. 석차 순 정렬 O
	// 4. Student 클래스의 toString 재정의 - 마트메인 참고
	
	// 등록
	void register() {
		System.out.println("==== 등록 기능 ====");
		
		if(count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}
			
			
		int no = StudentUtills.nextInt("학번을 입력하세요 : ");
		for (int i = 0; i < count; i++) {
			if(no == students[i].no) {
				while(true) {
					boolean pass = true;
					int num = StudentUtills.nextInt("중복된 학번입니다. 학번을 다시 입력하세요 : ");
					for(int j = 0; j < count; j++) {
						if(num == students[j].no) {
							pass = false;
							break;
						}
					}
					if (pass) {
						no = num;
						break;
					}
				}
			}
		}
		
		String name = StudentUtills.nextLine("이름을 입력하세요 : ");
		int kor = StudentUtills.nextInt("국어 점수를 입력하세요 : ");
		int eng = StudentUtills.nextInt("영어점수를 입력하세요 : ");
		int mat = StudentUtills.nextInt("수학점수를 입력하세요 : ");
		students[count++] = new Student(no, name, kor, eng, mat);
	}
	
	// 조회
	void read() {
		System.out.println("==== 조회 기능 ====");	
		for(int i = 0; i < count ; i++) {
			System.out.println(students[i].toString());
			
		}
	}
	
	// 수정
	void modify() {
		System.out.println("==== 수정 기능 ===="); // 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtills.nextInt("수정을 원하시는 학번을 입력하세요 : ");
		Student s = null;
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				s = students[i];
				break;
			}
		}
		s.name = StudentUtills.nextLine("이름을 입력하세요 : ");
		s.kor = StudentUtills.nextInt("국어 점수를 입력하세요 : ");
		s.eng = StudentUtills.nextInt("영어점수를 입력하세요 : ");
		s.mat = StudentUtills.nextInt("수학점수를 입력하세요 : ");
	}
	
	// 삭제
	void remove() {
		System.out.println("==== 삭제 기능 ====");
		int no = StudentUtills.nextInt("삭제를 원하시는 학번을 입력하세요 : ");
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i + 1, students, i ,  count-- - i - 1);
				break;
			}	
		}
	}
	
	
	
	// 과목별 평균
	void allavg() {
		System.out.println("==== 과목별 평균 확인 ====");
		double kor = 0; // 국어 평균
		for(int i = 0; i < count; i++) {
			kor += students[i].kor;
		}
		kor /= count;
		System.out.print("국어 평균 : " + kor);
		
		double eng = 0; // 영어 평균
		for(int i = 0; i < count; i++) {
			eng += students[i].eng;
		}
		eng /= count;
		System.out.print(", 영어 평균 : " + eng);
		
		double mat = 0; // 수학 평균
		for(int i = 0; i < count; i++) {
			mat += students[i].mat;
		}
		mat /= count;
		System.out.print(", 수학 평균 : " + mat);
		
		
		double avg = (kor + eng + mat) / 3;
		System.out.println(", 전체 평균 : " + avg);
		
		
	}
	
	
	// 석차순 조회
	void rank() {
		System.out.println("==== 전체 석차 확인 ====");
		copy = students;
		Student[] copy2 = new Student[count];
		copy = Arrays.copyOf(copy, count);
		
		int countStu = 0;
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count - i; j++) {
				
			}
		}
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count -1 - i; j++) {
				if (copy[j].avg() < copy[j+1].avg()) {
					copy2[0] = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = copy2[0];
				}
			}
		}
		int rank = 1;
		for(int i = 0; i < count ; i++) {
			System.out.println("[ " + rank++ + "위 ]" + "\n" + copy[i].toString());
			
		}
	}
	
	
	
	
	
	
}
