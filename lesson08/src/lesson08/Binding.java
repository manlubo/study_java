package lesson08;

public class Binding {
	public static void main(String[] args) {
		A obj = new B();
		
		System.out.println(obj);
		System.out.println(obj.i);
		System.out.println(obj.si);
		obj.sm();
		obj.m();
		
		//////////////////////////
		A a = new A();
		B b = new B();
		
		
		A c = b;  //조상 타입으로 선언해서 들어갈 수 있다.
		System.out.println(c);
//		B d = (B)a; // 조상타입을 강제로 자식타입에 넣을 수 없다.
//		
		B e = (B)c; // A타입으로 선언했으나, B타입 강제 형변환 해서 출력가능
		System.out.println(e);
	}
}
class A{
	static int si = 1;
	int i = 2;
	static void sm() {System.out.println("A.sm()");}
	void m() {System.out.println("A.m()");}
}

class B extends A{
	static int si = 3;
	int i = 4;
	static void sm() {System.out.println("B.sm()");}
	void m() {System.out.println("B.m()");}
}
