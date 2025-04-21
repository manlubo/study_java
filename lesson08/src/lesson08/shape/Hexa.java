package lesson08.shape;

public class Hexa extends Shape implements Shape3D{
	int  z;
	
	Rect rect;
	
	public Hexa() {}
	
	public Hexa(Rect rect, int z) {
		this.rect = rect;
		this.z = z;
	}
	
	
	
	public double volume() {
		return rect.area() * z;  
	}
	
	public double area() {
		return rect.area() * 2 + rect.circum() * z;  
	}
	public String toString() {
		return super.toString() + "\n 부피 : " + volume();
	}
}
