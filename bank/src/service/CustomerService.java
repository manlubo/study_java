package service;

import java.util.ArrayList;
import java.util.List;
import domain.Customer;
import utils.BankUtils;

public class CustomerService {
	private List<Customer> customers = new ArrayList<>();
	private Customer loginCustomer; // 초기 상태
	
	private static CustomerService customerService = new CustomerService();
	private CustomerService() {}
	public static CustomerService getInstance() {
		return customerService;
	}
	int count = 1;
	{
		customers.add(new Customer(count++, "새똥이", "010-1111-2222", "ssa@gmail.com", "ssa", "1234"));
	}
	
	
	
	// 로그인 커스터머 확인
	public Customer getLoginCustomer() {
		return loginCustomer;
	}
	
	// 중복체크
	public Customer findByTel(String tel) { // 전화번호
		Customer customer = null;
		for (int i = 0; i < customers.size(); i++) {
			if(tel.equals(customers.get(i).getTel())) {
				customer = customers.get(i);
				break;
			}
		}
		return customer;
	}
	
	public Customer findById(String id) { // 아이디
		Customer customer = null;
		for (int i = 0; i < customers.size(); i++) {
			if(id.equals(customers.get(i).getId())) {
				customer = customers.get(i);
				break;
			}
		}
		return customer;
	}
	
	// 전화번호 정규식
	String telcheck = "01[0-16-9]{1}-[0-9]{3,4}-[0-9]{4}";
	// 이메일 정규식
	String emailcheck = "[a-zA-Z]{1}[-_.0-9a-zA-Z]*@[0-9a-zA-Z]*.[a-zA-Z]{2,6}";
	
	// 회원가입
	public void register() {
		System.out.println("==========회원가입===========");
		String name = BankUtils.nextLine("이름을 입력해주세요.");
		String tel = BankUtils.nextLine("전화번호를 입력해주세요. (10 ~ 11자리 숫자와 - 로 구성되어야합니다.)");
		if(!tel.matches(telcheck)) {
			System.out.println("형식에 맞지않는 전화번호입니다. (ex. 010-0000-0000)");
			return;
		}
		
		Customer c = findByTel(tel);
		if(c != null) {
			System.out.println("중복된 전화번호가 존재합니다.");
			return;
		}
		String email = BankUtils.nextLine("이메일을 입력해주세요.");
		if(!email.matches(emailcheck)) {
			System.out.println("올바르지 않은 이메일입니다.");
			return;
		}
		String id = BankUtils.nextLine("사용하실 아이디를 입력해주세요.");
		c = findById(id);
		if(c != null) {
			System.out.println("중복된 아이디가 존재합니다.");
			return;
		}
		
		String pw = BankUtils.nextLine("사용하실 비밀번호를 입력해주세요.");
		String pwCheck = BankUtils.nextLine("비밀번호 확인 : 입력하신 비밀번호를 한번더 입력해주세요.");
		if(!pw.equals(pwCheck)) {
			System.out.println("입력하신 비밀번호가 서로 다릅니다.");
			return;
		}
		
		customers.add(new Customer(count++, name, tel, email, id, pw));
	}
	
	
	
	// 로그인
	public void login() {
		String id = BankUtils.nextLine("아이디를 입력해주세요.");
		String pw = BankUtils.nextLine("비밀번호를 입력해주세요.");
		
		boolean flag = false;
		for(Customer c : customers) {
			if(c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
				break;
			}
		}
		if(!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
		
	}
	
	// 로그인 유저와 유저정보 연동
	public void sync() {
		for (int i = 0; i < customers.size(); i++) {
			if(loginCustomer.getId().equals(customers.get(i).getId())) {
				customers.remove(i);
				customers.add(i,loginCustomer);
				break;
			}
		}
	}
	
	
	//로그아웃
	public void logout() {
		sync();
		loginCustomer = null;
		System.out.println("로그아웃 되었습니다.");
	}
	
	
	
	// 회원정보 조회
	public void userInfo() {
		System.out.println(loginCustomer.toString());
	}
	
	// 회원정보 수정
	public void userModify() {
		System.out.println("========회원정보 수정========");
		int input = BankUtils.nextInt("1.전화번호 변경 2.이메일 변경 3.비밀번호 변경 7.나가기");
		switch(input) {
			case 1:{
				System.out.println("전화번호 변경");
				String tel = BankUtils.nextLine("변경하실 전화번호를 입력해주세요. (10 ~ 11자리 숫자와 - 로 구성되어야합니다.)");
				if(!tel.matches(telcheck)) {
					System.out.println("형식에 맞지않는 전화번호입니다. (ex. 010-0000-0000)");
					return;
				}
				Customer c = findByTel(tel);
				if(c != null) {
					System.out.println("중복된 전화번호가 존재합니다.");
					return;
				}
				String pw = BankUtils.nextLine("변경을 위해 현재 비밀번호를 입력해주세요.");
				if(!pw.equals(loginCustomer.getPw())) {
					System.out.println("입력하신 비밀번호가 틀렸습니다.");
					return;
				}
				
				
				loginCustomer = new Customer(loginCustomer.getNo(),loginCustomer.getName(), tel, loginCustomer.getEmail(), loginCustomer.getId(), loginCustomer.getPw());
				System.out.println("회원정보가 변경되었습니다.");
				sync();
				break;
			}
			case 2:{
				System.out.println("이메일 변경");
				String email = BankUtils.nextLine("변경하실 이메일을 입력해주세요.");
				if(!email.matches(emailcheck)) {
					System.out.println("올바르지 않은 이메일입니다.");
					return;
				}
				if(email.equals(loginCustomer.getEmail())) {
					System.out.println("현재 이용 중인 이메일로 변경하실 수 없습니다.");
					return;
				}
				String pw = BankUtils.nextLine("변경을 위해 현재 비밀번호를 입력해주세요.");
				if(!pw.equals(loginCustomer.getPw())) {
					System.out.println("입력하신 비밀번호가 틀렸습니다.");
					return;
				}
				loginCustomer = new Customer(loginCustomer.getNo(),loginCustomer.getName(), loginCustomer.getTel(), email, loginCustomer.getId(), loginCustomer.getPw());
				sync();
				System.out.println("회원정보가 변경되었습니다.");
				break;
			}
			case 3:{
				String pw = BankUtils.nextLine("변경을 위해 현재 비밀번호를 입력해주세요.");
				if(!pw.equals(loginCustomer.getPw())) {
					System.out.println("입력하신 비밀번호가 틀렸습니다.");
					return;
				}
				String pwModify = BankUtils.nextLine("변경하실 비밀번호를 입력해주세요.");
				if(pwModify.equals(pw)) {
					System.out.println("현재 이용 중인 비밀번호로 변경하실 수 없습니다.");
					return;
				}
				if(!pwModify.equals(BankUtils.nextLine("비밀번호 확인 : 입력하신 비밀번호를 한번더 입력해주세요."))) {
					System.out.println("입력하신 비밀번호가 서로 다릅니다.");
					return;
				}
				loginCustomer = new Customer(loginCustomer.getNo(),loginCustomer.getName(), loginCustomer.getTel(), loginCustomer.getEmail(), loginCustomer.getId(), pwModify);
				sync();
				System.out.println("회원정보가 변경되었습니다.");
				break;
			}
			case 7:{
				return;
			}
			default:{
				System.out.println("잘못된 입력");
			}
		}
	}
	
	
	// 회원탈퇴
	public void delete() {
		System.out.println("==========회원 탈퇴==========");
		for (int i = 0; i < customers.size(); i++) {
			if(loginCustomer.getId().equals(customers.get(i).getId()) && loginCustomer.getPw().equals(BankUtils.nextLine("회원 탈퇴를 위해 현재 비밀번호를 입력해주세요.")) && BankUtils.nextConfirm("정말로 탈퇴하시겠습니까? (y / n)")) {
				customers.remove(i);
				loginCustomer = null;
				System.out.println("회원 탈퇴 완료");
				break;
			}
		}
	}
	
}
