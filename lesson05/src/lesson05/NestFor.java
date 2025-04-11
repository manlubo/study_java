package lesson05;

public class NestFor {
	public static void main(String[] args) {
		// 2중 이상 for문 사용의 대표적 예시
		// 구구단
		// *
		
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i >= j) {
					System.out.print("*");	
				}
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		
		
//		for(int i=1; i <= 50; i++) {
//			int tmp = i % 10;
//			while( i / 10 != 0){
//				if(tmp % 3 == 0 && tmp != 0) {
//					System.out.println("짝");
//				}
//				else {
//					System.out.println(i);
//				}
//				tmp /= 10;
//			}
//		}
		
		
		// 공약수
//		int a = 132;
//		int b = 122;
//		for(int i = 1; i <= a; i++) {
//			for(int j = 1; j <= b; j++) {
//				if(b % j == 0 && a % i == 0 && i == j) {
//					System.out.println(j);
//				}
//			}			
//		}
		
		
		int a = 12;
		int b = 18;
		
		int c = 2;
//		for(int i = 1; i <= a; i++) {
//			for(int j = 1; j <= b; j++) {
//				if(b % j == 0 && a % i == 0 && i == j) {
//					c = j;
//				}
//			}
//		}
//		System.out.println("최대 공약수 : " + c);
		
		
		// 구구단 x중첩
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",c, i, i*c);
			if(i == 10) {
				i = 1;
			}
			else if(c == 10) {
				i = 10;
			}
			c += 1;
		}
		
//		System.out.println("=======================================");
//		for(int i = 0; i < 10; i ++) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
	}
}
