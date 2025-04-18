package lesson08.shape;

public class Prism extends Shape3d{
	int x, y, z;
	
	public Prism() {}
	
	public Prism(int x,int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Tri tri = new Tri(x , y);
	
	public double volume() {
		return tri.area() * z;  
	}
	public double surfacearea() {
		return tri.area() * 2 + tri.circum() * z;  
	}
}
