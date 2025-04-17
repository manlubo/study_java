package student;

// Data class
public class Student {
	// 1. StudentMain의 나머지 기능 구현(메세지 출력)
	// 2. Student의 생성자 구현
	// 기본생성자 + (학번,이름), (다섯개의 필드를 다 사용)
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	
	
	
	Student(){
		
	}
	
	Student(int no, String name, int kor, int eng, int mat){
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	
	public String toString() {
		return "학번 : " + no + "\n이름 : " + name + "\n국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + mat + "\n총점 : " + total() + ", 평균 : " + avg() + "\n";
		
	}
	
	int total () {
		return kor + eng + mat;
	}
	
	double avg () {
		return total() / 3d;
	}
	
	
	
}
