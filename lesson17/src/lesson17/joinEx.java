package lesson17;

public class joinEx {
	public static void main(String[] args) throws InterruptedException {
		Myjoin join1 = new Myjoin(1, 5000);
		Myjoin join2 = new Myjoin(5001, 10000);
		
		join1.start();
		join2.start();
			
		join1.join(); // join1이 끝날 때까지 메인을 멈춤
//		join2.join();
		
		System.out.println(join1.sum + join2.sum);
		
		
	}
}
class Myjoin extends Thread{
	int start;
	int end;
	int sum;
	public Myjoin(int start, int end) {
	
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			sum += i;
		}
	}
	
	
}