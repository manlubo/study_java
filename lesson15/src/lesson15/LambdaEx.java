package lesson15;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter inter = i -> i * i;
		
		
		System.out.println(inter.la(10));
		
		Object o = (MyInter)(i -> i * i);
			
		Runnable runnable = () -> {System.out.println("Runnable");};
		runnable.run();
	
	}
}

@FunctionalInterface
interface MyInter {
	int la(int i);
}