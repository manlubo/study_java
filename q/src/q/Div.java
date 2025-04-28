package q;

public class Div {
	public static void main(String[] args) {
		Div div = new Div();
		div.divide(5, 0);
	}
	
	void divide(int a, int b){
		try {
		 System.out.println(a / b);
		}
		catch (Exception e){
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
