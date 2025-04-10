package lesson05;

public class Ex250410 {
	public static void main(String[] args) {
		// 1. 상자 갯수 세기
		// 사과를 한 상자당 10개씩 담을 수 있습니다.
		// 사과의 갯수를 123개라고 했을 때 필요한 상자의 갯수 구하기
		// 연산자만 사용
		int apple = 123;
		int in = 10;
		int box = apple % in == 0 ? apple / in : (apple / in) + 1; 		
		
		System.out.println("박스는 총 " + box + "개가 필요합니다."); // 내가 푼 형식
		System.out.println("박스는 총 " + (apple + in - 1) / in + "개가 필요합니다."); // 쌤이 푼 형식
		
		
		//2. 합계 구하기
		// 1+ (-2) + 3 + (-4) .. (-98) + 99 + (-100)
		// 반복문 사용
		int sum = 0;
		for(int i = 1; i <= 100; i++){
//			if(i % 2 == 0) {
//				sum -= i;	
//			}
//			else {
//				sum += i;

//			} 내가 푼 형식
			sum += i % 2 == 0 ? -i : i ; // 쌤이 푼 형식
		}
		System.out.println("최종 sum = " + sum);
		
		
		
		
		
		
		//3. 소수 판정(prime number)
		// 지정된 자연수가 소수인지 아닌지를 출력 (0,1은 아님)
		
		int num = 11;
		int count = 0;
		for (int j = 2; j < num; j++) {
			if(num % j == 0) {
				count++;
			}
		}
		
		
		System.out.println(count == 0 ? "소수" : "소수가 아님"); 
		
	}
}
