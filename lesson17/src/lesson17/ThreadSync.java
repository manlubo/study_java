package lesson17;

public class ThreadSync {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		MySync mySync1 = new MySync(counter);
		MySync mySync2 = new MySync(counter);
		mySync1.start();
		mySync2.start();
		
		mySync1.join();
		mySync2.join();
		
		System.out.println(mySync1.counter.i); // 동시에 두개의 스레드에서 같은 값을 변경하면 값이 일정하지않고 정확하지않다.
		
		
		
	}
}

class Counter{
	int i;
	
	void increase() {
		synchronized (this){
			i++;
		}
	}
	
}

class MySync extends Thread{
	volatile long sum;// 롱타입일 때는 오류 이런식으로 해결가능
	Counter counter; // 참조형일 때는 synchronized로 해결
public MySync(Counter counter) {
	this.counter = counter;
}
	
	@Override
	public void run() {
		 for (int i = 0; i < 100_000; i++) {
			 counter.increase();
		 }
	}
	
	
}
