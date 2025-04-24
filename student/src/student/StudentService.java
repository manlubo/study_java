package student;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentService {
	// 1. comprator 사용해서 순위정보 표시

	
	
	// 랜덤 점수

	private int randomScore() {
			return (int)(Math.random() * 41) + 60;
	}
	
	// 학생 리스트, 학생 순위 리스트 생성
	List<Student> students = new ArrayList<Student>();
	List<Student> sortedStudents;
	
	{ // 초기화 블럭
//		
		students.add(Student.builder().no(1).name("개똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
		students.add(Student.builder().no(2).name("소똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
		students.add(Student.builder().no(3).name("말똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
		students.add(Student.builder().no(4).name("쥐똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
		
		sortedStudents = new ArrayList<Student>(students);
	}
	
	// 싱글톤
	private static StudentService studentService = new StudentService();
	private StudentService() {
		
	}
	public static StudentService getInstance() {
		return studentService;
	}
	
	
	// 중복 체크 - 입력 : 학번,  출력 : 학생
	public Student findBy(int no) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if(no == students.get(i).getNo()) {
				student = students.get(i);
				break;
			}
		}
		return student;
	}
	
	// 점수 범위 체크 메서드
	public int checkRange(String subject, int input, int start, int end) {
		if(input < start || input > end) {
			throw new IllegalArgumentException(subject + "값의 범위가 벗어났습니다. " + start + " ~ " + end + " 사이의 값을 입력해주세요.");
		}
		return input;
	}
	
	public int checkRange(String subject, int input) {
		return checkRange(subject, input, 0, 100);
	}
	
	// 이름 체크 메서드
	public String inputName() throws IllegalArgumentException {
		String name = StudentUtills.nextLine("이름을 입력하세요 : ");
		String namecheck = "[가-힣]{2,4}";
		if(!name.matches(namecheck)) {
			throw new IllegalArgumentException("이름은 2 ~ 4글자 한글로 입력해주세요.");
		}
		return name;
	}
	

	// 1. 등록
	public void register() {
		System.out.println("==== 등록 기능 ====");
		
		int no = StudentUtills.nextInt("학번을 입력하세요 : ");
		
		Student s = findBy(no);
		if (s != null) {
			System.out.println("중복된 학번이 존재합니다.");
			return;
		}
		
		
		String name = inputName();
		int kor = StudentUtills.nextInt("국어 점수를 입력하세요 : ");
		checkRange("국어", kor);
		
		int eng = StudentUtills.nextInt("영어점수를 입력하세요 : ");
		checkRange("영어", eng);
		
		int mat = StudentUtills.nextInt("수학점수를 입력하세요 : ");
		checkRange("수학", mat);
		

		students.add(new Student(no, name, kor, eng, mat));
		sortedStudents = new ArrayList<Student>(students);
	}
	
	
	// 2. 조회
	public void read() {
		System.out.println("==== 조회 기능 ====");	
		print(students);
	}
	
	public void readOrder() {
		System.out.println("==== 석차순 조회 기능 ====");
		print(sortedStudents);
	}
	
	public void print(List<Student> s) {
//		for(int i = 0; i < s.size(); i++) {
//			System.out.println(s.get(i).toString());
//		}
		s.forEach(System.out::println); // 스트림(?)
	}
	

	// 3. 수정
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
		
		
		s.setName(inputName()); 
		s.setKor(StudentUtills.nextInt("국어 점수를 입력하세요 : "));
		checkRange("국어", s.getKor());
		s.setEng(StudentUtills.nextInt("영어점수를 입력하세요 : "));
		checkRange("영어", s.getEng());
		s.setMat(StudentUtills.nextInt("수학점수를 입력하세요 : "));
		checkRange("수학", s.getMat());
	}
	
	
	// 4. 삭제
	public void remove() {
		System.out.println("==== 삭제 기능 ====");
		int no = StudentUtills.nextInt("삭제를 원하시는 학번을 입력하세요 : ");
		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		students.remove(s);
		sortedStudents.remove(s);
	}
	
	
	// 5. 과목별 평균
	public void allAvg() {
		System.out.println("==== 과목별 평균 확인 ====");
//		students.stream().map(s->s.getKor());
		
		double kor = 0; // 국어 평균
		double eng = 0; // 영어 평균
		double mat = 0; // 수학 평균
		int size = students.size();
		for(int i = 0; i < size; i++) {
			kor += students.get(i).getKor();
			eng += students.get(i).getEng();
			mat += students.get(i).getMat();
		}
		kor /= size;
		eng /= size;
		mat /= size;
		
		double avg = (kor + eng + mat) / 3;
		
		System.out.println(size + "명의 학생 평균입니다.");
		System.out.printf("국어 평균 : %.2f", kor);
		System.out.printf(", 영어 평균 : %.2f", eng);
		System.out.printf(", 수학 평균 : %.2f", mat);
		System.out.printf(", 전체 평균 : %.2f\n", avg);
	}
	
	
	// 6. 석차순 조회
	public void rank() {
		System.out.println("==== 전체 석차 확인 ====");
		int r = 1;
		
		// list sort()
		sortedStudents.sort((o1, o2) -> -(o1.total() - o2.total()));
		
		
		// 2. TreeSet()
//		sortedStudents = new ArrayList<>(new TreeSet<>(sortedStudents));
		
		// 3. Collections
		Collections.sort(sortedStudents,(o1, o2) -> -(o1.total() - o2.total()));

		for(Student s : sortedStudents) {
			System.out.println("[ " + r++ + "위 ] " + s.toString());
		}
		
	}	
}
