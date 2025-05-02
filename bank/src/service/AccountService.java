package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import service.CustomerService;
import domain.Account;
import domain.Customer;
import static utils.BankUtils.*;

public class AccountService {
	private List<Account> accounts = new ArrayList<>();
	
	private static AccountService accountService = new AccountService();
	private AccountService() {}
	public static AccountService getInstance() {
			return accountService;
	}
	private CustomerService customerService = CustomerService.getInstance();
	
	
	
	// 	개설
	public void open() {
		int count = accounts.isEmpty() ? 1 : accounts.get(accounts.size() - 1).getNo() + 1;
		String pw = nextLine("사용하실 비밀번호를 입력해주세요.");
		if(pw.equals(nextLine("[비밀번호 확인]비밀번호를 동일하게 입력해주세요.")))
		accounts.add(new Account(count, customerService.getLoginCustomer(), pw));
	}
	// 출력
	public void print(List<Account> list) {
		for(Account a : accounts) {
			System.out.println(a);
		}
	}
	
	//	입금
		public void deposit() {
			List<Account> myAccounts = findAccountBy(customerService.getLoginCustomer());
			print(myAccounts);
			int no = nextInt("입금할 계좌를 입력하세요");
			Account account = findBy(no);
			if(account == null) {
				System.out.println("없는 계좌번호입니다.");
				return;
			}
			
			account.setAmount(account.getAmount() + nextLong("입금할 금액을 입력하세요 :"));
			
		}
	
	// 	출금
		public void wirhdraw() {
			List<Account> myAccounts = findAccountBy(customerService.getLoginCustomer());
			print(myAccounts);
			int no = nextInt("출금할 계좌를 입력하세요");
			Account account = findBy(no);
			if(account == null) {
				System.out.println("없는 계좌번호입니다.");
				return;
			}
			long amount = nextLong("출금할 금액을 입력하세요 : ");
			if(account.getAmount() < amount) {
				System.out.println("잔고가 부족합니다.");
				return;
			}
			account.setAmount(account.getAmount() - amount);
		}
		
	// 	이체
		public void transfer() {
			List<Account> myAccounts = findAccountBy(customerService.getLoginCustomer());
			print(myAccounts);
			int no = nextInt("출금할 계좌를 입력하세요");
			Account account = findBy(no);
			if(account == null) {
				System.out.println("없는 계좌번호입니다.");
				return;
			}
			int targetNo = nextInt("이체 대상 계좌번호를 입력하세요 : ");
			Account targetAccount = findBy(targetNo);
			if(targetAccount == null) {
				System.out.println("없는 계좌번호입니다.");
				return;
			}
			String targetName = targetAccount.getCustomer().getName();
			if(!nextConfirm(targetName + "님의 계좌로 입금합니다.")) {
				System.out.println("취소되었습니다.");
				return;
			}
			
			long amount = nextLong("이체할 금액을 입력하세요 : ");
			if(account.getAmount() < amount) {
				System.out.println("잔고가 부족합니다.");
				return;
			}
		
			account.setAmount(account.getAmount() - amount);
			targetAccount.setAmount(targetAccount.getAmount() + amount);
			
			System.out.println("이체완료");
		}

	// 	해지
	public void close() {
		List<Account> myAccounts = findAccountBy(customerService.getLoginCustomer());
		print(myAccounts);
		int no = nextInt("해지할 계좌를 입력하세요");
		Account account = findBy(no);
		if(account == null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		if(!nextConfirm("해지하시겠습니까? (남은 잔고는 사라집니다.)")) {
			return;
		}
		accounts.remove(account);
	}
	
	// 입력 : 고객, 출력 : 리스트<계좌>
	public List<Account> findAccountBy(Customer c) {
//		List<Account> loginAccountList = new ArrayList<>();
//		향상포문
//		for(Account a : accounts) {
//			if(customerService.getLoginCustomer() == c) {
//				loginAccountList.add(a);
//			}
//		}
		
//		return loginAccountList;
		
//		스트림
		return accounts.stream().filter(a -> a.getCustomer() == c).collect(Collectors.toList());
	}
	
	
	public Account findBy(int no) {
		for (Account a : accounts) {
			if(no == a.getNo()) {
				return a;
			}
		}
		return null;
	}
	
	
}
