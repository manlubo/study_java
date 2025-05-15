package user;

import java.util.List;

public class CustomerService {
	UserService service = new UserService();
	void register() {
		Customer customer = new Customer("3", "소똥이", "3");
		if(!service.register(customer)) {
			System.out.println("등록이 실패했습니다.");
			return;
		}
		System.out.println("등록 성공");
	}
	
	Customer findby(String id) {
		return service.findBy(id, Customer.class);
	}
	
	List<Customer> customers(){
		return service.getUsers(Customer.class);
	}
	
	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		service.register();
		System.out.println(service.findby("1"));
		System.out.println(service.findby("2"));
		System.out.println(service.findby("3"));
		System.out.println(service.customers());
	}
}
