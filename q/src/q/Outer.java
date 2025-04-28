package q;

public class Outer {
	int i = 4;
	public Outer() {
	}
	
	class Inner {
		Inner(){	
		}
		public void print() {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new Outer().new Inner().print();
	}
}
