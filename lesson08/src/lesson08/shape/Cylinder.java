package lesson08.shape;

public class Cylinder extends Circle implements SHAPE3D {
	int x, z;
	
	
	
	public Cylinder() {}
	
	public Cylinder(int x, int z) {
		this.x = x;
		this.z = z;
	}
	
	Circle circle = new Circle(x);
	
	public double volume() {
		return circle.area() * z;  
	}
	public double surfacearea() {
		return circle.circum() * z + circle.area() * 2;  
	}
}
