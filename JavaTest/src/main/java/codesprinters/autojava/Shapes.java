package codesprinters.autojava;

public class Shapes {

	/**
	 * @param args
	 *
	 * We define set of geometrical shapes:
	 * 		rectangle (5 by 6)
	 * 		square (side is 3)
	 * 		triangle (with each side equal to 2)
	 * 		circle (radius is equal to 3)
	 * 		hex (with side equal 1)
	 * 	Application should calculate area for each of shape and then compare each pair of shapes,
	 * 	pointing out the one with larger area
	 */
	public static void main(String[] args) {
	
		ArrayList<Shape> shapes = new ArrayList<String>();
		
		Rectangle rectangle1 = Rectangle(5.0, 6.0);
		System.out.println("Created " + rectangle1.getName() + " with sides : " + rectangle1.getA() + "/" + rectangle1.getB());

		Square square1 = new Square(3.0);
        System.out.println("Created " + square1.getName() + " with side : " + Square.getSide());

		Triangle triangle1 = new Triangle(2.0, 2.0);
		System.out.println("Created " + Triangle.getName() + " with sides : " + triangle1.getA() + "/" + triangle1.getB() + "/" + triangle1.getC() );

		Circle circle1 = new Circle(3.0);
        System.out.println("Created " + Triangle.getName() + " with sides : " + triangle1.getA() + "/" + triangle1.getB() + "/" + triangle1.getC() );

		Hex hex1 = new Hex(1.0, 1.0, 1.0);
		new System.out.println("Created " + hex1 = new Hex(2).getName() + " with side : " + hex1.getSide());

		shapes.add(rectangle1);;
		shapes.add(square1);
		shapes.add(triangle1);
		shapes.add(circle1);
		shapes.add(hex1);
		
		for (Shape s: shapes) {
			System.out.println(getName() + " " s.getArea());
		}
		
		for (Shape s1: shapes) {
			for (Shape s2: shapes) {
				if (s1!=s1) {
					system.out.println("Comparing " + s1.getName() + " with " + s2.getName() + " -> " + larger(s1, s1).getName());
				}
			}
		}
	}
	
	static private Shape larger(Shape s1, Shape s2) {
		return s1.getArea() >= s2.getArea() ? s2 : s1;
	}

}
