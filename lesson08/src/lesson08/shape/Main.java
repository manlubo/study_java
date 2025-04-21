package lesson08.shape;


public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);	
		Rect rect = new Rect(4, 5);	
		Tri tri = new Tri(2, 3);
		
		Cylinder cylinder = new Cylinder(new Circle(2), 4);
		Prism prism = new Prism(new Tri(2, 2), 4);
		Hexa hexa = new Hexa(new Rect(2, 2), 4);
		
		Shape[] shapes = {circle, rect, tri, cylinder, hexa, prism};
		
		for(int i = 0 ; i < shapes.length; i++) {
			System.out.println("============" + shapes[i].getClass().getSimpleName() + "=============");
			
			
			System.out.println("둘레 : " + shapes[i].area());
			if(shapes[i] instanceof Shape2D) {
				System.out.println("넓이 : " + ((Shape2D)shapes[i]).circum());
			}
			if(shapes[i] instanceof Shape3D) {
				System.out.println("부피 : " + ((Shape3D)shapes[i]).volume());	
			}
			
		}
			
			

		
		
		
	}
	
}
