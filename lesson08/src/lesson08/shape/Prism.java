package lesson08.shape;

public class Prism extends Shape implements Shape3D{

	Tri tri;
	
	int z;
	
	

	
	public Prism() {}
	
	
	public Prism(Tri tri, int z) {
		this.tri = tri;
		this.z = z;
	}
	
	
	public double volume() {
		return tri.area() * z;  
	}
	public double area() {
		return tri.area() * 2 + tri.circum() * z;  
	}
	public String toString() {
		return super.toString() + "\n 부피 : " + volume();
	}
}
