package lesson08.shape;

public class Hexa extends Rect implements SHAPE3D{
	int x, y, z;
	
	
	
	public Hexa() {}
	
	public Hexa(int x,int y, int z) {
		super.x = x;
		super.y = y;
		this.z = z;
	}
	
	
	
	public double volume() {
		return area() * z;  
	}
	
	public double surfacearea() {
		return area() * 2 + circum() * z;  
	}
}
