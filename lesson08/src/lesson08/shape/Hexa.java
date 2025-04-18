package lesson08.shape;

public class Hexa extends Rect implements SHAPE3D{
	int x, y, z;
	
	
	
	public Hexa() {}
	
	public Hexa(int x,int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Rect rect = new Rect(x, y);
	
	public double volume() {
		return rect.area() * z;  
	}
	public double surfacearea() {
		return rect.area() * 2 + rect.area() * 2;  
	}
}
