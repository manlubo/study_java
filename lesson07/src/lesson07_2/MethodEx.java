package lesson07_2;

public class MethodEx {
	public static void main(String[] args) {
		
		int result = add(10, 20);
		System.out.println(result);
		print(result, "입니다.");
		System.out.println(addAll(1, 2, 3));
		
		// Stack - 데이터를 어떻게 다룰것인가?의 기준
		// 후입선출 = last in first out  - lifo
		//return; 이 생략되어있다.
		
		return;
		
		
		
	}
	static int add(int a, int b) {
		return a + b;
	}
	static void print(int a, String s) {
		System.out.println(a + s);
	}
	
	static int addAll(int... nums) {
		int ret = 0;
		for(int n : nums) {
			ret += n;
		}
		return ret;
	}
	
}
