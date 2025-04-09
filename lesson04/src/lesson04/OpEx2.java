package lesson04;

public class OpEx2 {
	public static void main(String[] args) {
		int a = 5 + 5;
		System.out.println("5 + 5 = " + a);
		int b = a - 5;
		System.out.println("10 - 5 = " + b);
		int c = b * 2;
		System.out.println("5 * 2 = " + c);
		int d = c / 5;
		System.out.println("10 / 5 = " + d);
		
		//나머지 연산
		int e = 10 % 3;
		System.out.println("10 % 3 = " + e);
		
		// 산술연산
		// int보다 작은 타입들, byte, short, char 산술연산으로 변경 시 int로 변경된다.
		
		char ch1 = 'A';
		ch1 = (char)(ch1 + 1);
		System.out.println(ch1);
				
		ch1++;
		System.out.println(ch1);
		
		// quiz 소수점 둘째자리까지 자르기
		// double val = 1.234567
		
		double val = 1.234567;
		val = val * 100;
		val = (int)val;
		val = (double)val / 100;
		
		System.out.println(val);
	}
}
