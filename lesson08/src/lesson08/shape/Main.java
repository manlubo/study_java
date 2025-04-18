package lesson08.shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		
//		System.out.println(circle.area()); //넓이
//		System.out.println(circle.circum()); //둘레
		
		Rect rect = new Rect(4, 5);
//		System.out.println(rect.area());
//		System.out.println(rect.circum());
		
		Tri tri = new Tri(2, 3);
		
		
		Shape[] shapes = {circle, rect, tri};
		
		for(int i = 0 ; i < shapes.length; i++) {
			System.out.println("============" + shapes[i].getClass().getSimpleName() + "=============");
			System.out.println(shapes[i].area());
			System.out.println(shapes[i].circum());
		}
		
		Cylinder cylinder = new Cylinder(3, 4);
		
		Hexa hexa = new Hexa(4, 5, 6);
		
		Prism prism = new Prism(4, 5, 6);
		
		SHAPE3D shapes3d = new 
		
		for(int i = 0 ; i < shapes3d.length; i++) {
			System.out.println("============" + shapes2[i].getClass().getSimpleName() + "=============");
			System.out.println(shapes2[i].area());
			System.out.println(shapes[i].circum());
		}
		
	}
	
}
