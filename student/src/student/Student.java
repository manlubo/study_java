package student;

import java.io.Serializable;
import java.net.MulticastSocket;

// Data class
public class Student implements Comparable<Student>, Serializable{
	// 클래스 내에 선언할 위치
	// 1. 필드
	// 2. 생성자
	// 3. getter / setter
	// 4. 추가적인 메서드
	
	//필드
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//생성자
	public Student(){
		
	}
	public Student(int no, String name, int kor, int eng, int mat){
			setNo(no);
			setName(name);
			setKor(kor);
			setEng(eng);
			setMat(mat);
	
	}
	public Student(int no, String name){
		setNo(no);
		setName(name);
	}
	
	//투스트링
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", getNo(), getName(), getKor(), getEng(), getMat(), avg(), total());
		
	}
	
	
	
	
	// getter
	public int getNo() {return no;}
	public String getName() {return name;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public int getMat() {return mat;}
	
	// setter
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {

		this.name = name;
	}
	public void setKor(int kor) {

		this.kor = kor;
	}
	public void setEng(int eng) {

		this.eng = eng;
	}
	public void setMat(int mat) {

		this.mat = mat;
	}
	
	
	
	// 총점
	public int total () {
		return getKor() + getEng() + getMat();
	}
	// 평균
	public double avg () {
		return total() / 3d;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
	}
	
	public static Builder builder() {
		return new Builder();
	}
	static class Builder{
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int mat;
		
		public Builder no(int no) {
			this.no = no;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder kor(int kor) {
			this.kor = kor;
			return this;
		}
		public Builder eng(int eng) {
			this.eng = eng;
			return this;
		}
		public Builder mat(int mat) {
			this.mat = mat;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
	
	private Student(Builder builder) {
		this.no = builder.no;
		this.name = builder.name;
		this.kor = builder.kor;
		this.eng = builder.eng;
		this.mat = builder.mat;
	}
	
//	public static void main(String[] args) {
//		Student student = Student.builder().no(1).name("새똥이").kor(90).build();
//		System.out.println(student);
//	}

	
	
}
