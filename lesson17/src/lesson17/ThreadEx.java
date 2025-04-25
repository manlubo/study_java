package lesson17;

public class ThreadEx {
	public static void main(String[] args) {
		System.out.println("main 시작");
		MyThread myThread = new MyThread(); 
		MyThread myThread2 = new MyThread();
		myThread.start(); // 스레드를 생성
		myThread2.start();
		Thread thread = new Thread(new MyRunnalbe());
		thread.start();
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				System.out.println(i + " :: Thread :: " + Thread.currentThread().getName());
			}
		});
		thread2.start();
		
//		myThread.run();
//		myThread2.run();
		System.out.println("main 종료");
		
	}
}
class MyThread extends Thread{ // 쓰레드 상속
	@Override
	public void run() {
		test();
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " :: Thread :: " + getName());
		}
	}
	void test() {
		System.out.println("test");
	}
}
class MyRunnalbe implements Runnable{ // 상속을 못받으면 러너블인터페이스로 가능한데, run 메서드를 오버라이드 해주어야한다.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " :: Thread :: " + Thread.currentThread().getName());
		}
	}
	
}