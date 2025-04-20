package lesson08.shape;

public class Prism extends Tri implements SHAPE3D{

	
	
	int x, y, z;
	
	

	
	public Prism() {}
	
//	public Prism(int x, int y) {
//		super.x = x;
//		super.y = y;
//		
//	}
	
	public Prism(int x,int y,int z) {
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
