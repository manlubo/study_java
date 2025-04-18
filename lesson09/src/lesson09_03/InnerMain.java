package lesson09_03;

public class InnerMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner i;
		Outer.SInner si;
		
		i = outer.new Inner();
		si = new Outer.SInner();
		
		
	}
}
class Outer{ // 내부 클래스
	class Inner{
		class I{
			class J{
				class K{
					
				}
			}
		}
	}
	
	static class SInner {
		
	}
	
	void m() { // 로컬클래스
		class Local{
			
		}
	}
}
