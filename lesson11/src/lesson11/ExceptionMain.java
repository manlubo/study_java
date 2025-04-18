package lesson11;

public class ExceptionMain {
	public static void main(String[] args) {
		// try, catch, finally, throw, throws
		int i = 1;
		System.out.println(1);
		try { // 안에서 예외사항 발생 시 해당 항목과 하단 항목을 실행시키지 않고, catch 항목을 실행한다.
			System.out.println(2);
			System.out.println(args[0]); // exception
			System.out.println(3 / 0); //exception 
			System.out.println(4);	// 만약, 안에서 예외사항이 발생하지 않으면, catch 항목을 실행하지 않는다.
		}
		catch (NullPointerException e) {
			System.out.println(5);
		}
		catch (ArithmeticException e) {
			System.out.println("a");
		}
		catch (RuntimeException e) {
			System.out.println("b");
		}
		finally {
			
		}
		System.out.println(6);
	}
}
