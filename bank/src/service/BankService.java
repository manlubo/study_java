package service;

import domain.Customer;
import utils.BankUtils;

public class BankService {
	
	
	private static BankService bankService = new BankService();
	private BankService() {}
	public static BankService getInstance() {
		return bankService;
	}
	
	private CustomerService customerService = CustomerService.getInstance();
	
	public void menu() throws Exception{
		try {
			if(customerService.getLoginCustomer() == null) { //
				int no = BankUtils.nextInt("1.회원가입 2.로그인 7.종료");
				switch(no) {
					case 1:{
						customerService.register();
						break;
					}
					case 2:{
						customerService.login();
						break;
					}
					case 7:{
						throw new Exception();
						
						// 오류 만들어서 메인에 던져서 종료하기...
						
					}
					default:{
						System.out.println("잘못된 입력입니다.");
						break;
					}
				}
			}
			else { //
				System.out.println("=========로그인 상태=========");
				int no = BankUtils.nextInt("1.회원정보조회 2.회원정보수정 6.회원탈퇴 7.로그아웃");
				switch(no){
					case 1:{
						customerService.userInfo();
						break;
					}
					case 2:{
						customerService.userModify();
						break;
					}
				
					case 6:{
						customerService.delete();
						break;
					}
					case 7:{
						customerService.logout();
						break;
					}
					default:{
						System.out.println("잘못된 입력입니다.");
						break;
					}
				}
			}
		}
		catch (NumberFormatException e){
			System.out.println("잘못된 입력입니다.");
		}
		catch (Exception e){
			throw e;
		}
	}
}

