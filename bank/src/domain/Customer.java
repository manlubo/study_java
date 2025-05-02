package domain;

public class Customer {
	//이름, 연락처, 이메일, 회원번호, 아이디, 비밀번호
	private int no;
	private String name;
	private String tel;
	private String email;
	private String id;
	private String pw;
	
	// 생성자
	public Customer() {}
		
	public Customer(int no, String name, String tel, String email, String id, String pw) {
			this.no = no;
			this.name = name;
			this.tel = tel;
			this.email = email;
			this.id = id;
			this.pw = pw;
	}
	
	
	
	// 게터 , 세터
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	// 투스트링
	@Override
	public String toString() {
		return String.format("[%s(%s)님의 회원정보]%n전화번호 : %s%n이메일 : %s", name, id, tel, email);
	}
	
	
	
	
	
}
