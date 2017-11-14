package codesprinters.autojava;

public class Hex extends AbstractShape {

	public String getSide() {
		return "" + a;
	}

	private double a;
	
	public Hex(double a) {
		this.a = a;
	}

	@Override
	public double getArea() {
		Triangle t = new Triangle (a, a, a);
		return 6 * t.getArea();
	}

}
