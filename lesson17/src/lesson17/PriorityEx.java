package lesson17;

public class PriorityEx {
	public static void main(String[] args) {
		Prior prior = new Prior("첫번째 스레드");
		Prior prior2 = new Prior("두번째 스레드");
		prior.setPriority(Thread.MIN_PRIORITY);
		prior2.setPriority(Thread.MAX_PRIORITY);
		prior.start();
		prior2.start();
	}
}
class Prior extends Thread{
	public Prior(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " :: " + getName());
		}
	}
	
}