package student;

// Data class
public class Student {
	
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	
	
	
	
	// 학번 접근제한자
	public int getNo() {return no;}
	public void setNo(int no) {
		
		if (no <= 0) return;
		this.no = no;
		
	}
	
	
	
	// 이름 접근 제한자
	public String getName() {return name;}
	public void setName(String name) {
		for(int i = 0; i <  name.length(); i++) {
			if(name.charAt(i) < '가' || name.charAt(i) > '힣' || name.length() < 2 || name.length() > 4) {
				System.out.println("이름은 한글 2 ~ 4글자로 입력해주세요.");
				return;
			}
		}
		this.name = name;
	}
	
	
	
	// 국어 접근 제한자
	
	public int getKor() {return kor;}
	public void setKor(int kor) {

		if(kor < 0 || kor > 100) {
			System.out.println("잘못된 국어 점수입니다. 0 ~ 100 사이의 값을 입력해주세요.");
			return;
		}
		this.kor = kor;
	}
	
	// 영어 접근 제한자
	
	public int getEng() {return eng;}
	public void setEng(int eng) {
		if(eng < 0 || eng > 100) {
			System.out.println("잘못된 영어 점수입니다. 0 ~ 100 사이의 값을 입력해주세요.");
			return;
		}
		this.eng = eng;
	}
	
	// 수학 접근 제한자
	
	public int getMat() {return mat;}
	public void setMat(int mat) {
		if(mat < 0 || mat > 100) {
			System.out.println("잘못된 수학 점수입니다. 0 ~ 100 사이의 값을 입력해주세요.");
			return;
		}
		this.mat = mat;
	}
	
	
	
	
	
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
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", getNo(), getName(), getKor(), getEng(), getMat(), avg(), total());
		
	}
	
	public int total () {
		return getKor() + getEng() + getMat();
	}
	
	public double avg () {
		return total() / 3d;
	}
	
	
	
	
	
	
}
