package lesson08.shape;

public class Cylinder extends Shape implements Shape3D {
	Circle circle;
	int z;
	
	public Cylinder() {}
	
	public Cylinder(Circle circle, int z) {
		this.circle = circle;
		this.z = z;
	}
	
	
	
	public double volume() {
		return circle.area() * z;  
	}
	public double area() {
		return circle.circum() * z + circle.area() * 2;  
	}
	public String toString() {
		return super.toString() + "\n 부피 : " + volume();
	}
}
