package lesson11;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try{
			m();	
		}
		catch (Exception e) {
			System.out.println("main catch");
		}
	}

	
	
	static void m() {
		try {
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(3);
		}
		finally { // 무조건 실행하고, 캐치하지 못한 예외사항은 호출 한 지점으로 가서 try로 감싸져있는지 확인, catch 확인함.
			System.out.println(4);
		}
		System.out.println(5);
	}
}

