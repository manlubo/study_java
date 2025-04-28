package q;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> s = new Box<>();
		Box<Integer> i = new Box<>();
		
		s.setT("안녕");
		i.setT(10);
		
		System.out.println("s : " + s.getT() + ", i : "+ i.getT());
		
	}
	
}
class Box<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
