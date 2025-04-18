package lesson08.shape;

public class Tri extends Shape{
	int x, y;
	
	public Tri () {}
	public Tri (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public double circum() {
		return x + y + Math.sqrt(hypo());
		
	}
	public double area() {
		return x * y / 2;
	}
	
	public double hypo() {
		return Math.sqrt(x * x + y * y);
	}
	
	
}
