package lesson08.shape;

public class Cylinder extends Circle implements SHAPE3D {
	int x, z;
	
	
	
	public Cylinder() {}
	
	public Cylinder(int x, int z) {
		this.x = x;
		this.z = z;
	}
	
	
	
	public double volume() {
		return area() * z;  
	}
	public double surfacearea() {
		return circum() * z + area() * 2;  
	}
}
