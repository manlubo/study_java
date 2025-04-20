package lesson08.shape;

public class Cylinder extends Circle implements SHAPE3D {
	int r, z;
	
	
	
	public Cylinder() {}
	
	public Cylinder(int r, int z) {
		super.r = r;
		this.z = z;
	}
	
	
	
	public double volume() {
		return area() * z;  
	}
	public double surfacearea() {
		return circum() * z + area() * 2;  
	}
}
