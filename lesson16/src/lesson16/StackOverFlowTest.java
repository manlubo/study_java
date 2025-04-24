package lesson16;

public class StackOverFlowTest {
	public static void main(String[] args) throws Exception {
		
//		new Data();
//		new Data();
//		Class.forName("lesson16.Data");
		Data.print(10);
		Data.print(10);
		Data.print(10);
		Data.print(10);
		Data.print(10);
		Data.print(10);
		Data.print(10);
	}
}
class Data{
//	Data data = new Data();
	int i = print(1);
	int i3 = print(4);
	static int si = print(2);
	static int si2 = print(3);
	{
		System.out.println("초기화 블럭");
	}
	static {
		System.out.println("클래스 초기화 블럭");
	}
	public Data() {
		System.out.println("생성자");
	}
	static int print(int i) {
		System.out.println("print 호출됨" + i);
		return i;
	}
}