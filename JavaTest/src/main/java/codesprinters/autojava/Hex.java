package codesprinters.autojava;

public class Hex extends AbstractShape {

	public String getSide() {
		return "" + a;
	}

	private double a;
	
	private Hex(double a) {
		this.a = a;
	}

	@Override
	public double getArea() {
		Triangle t = Triangle (a, a, a);
		6 * t.getArea();
	}

}
