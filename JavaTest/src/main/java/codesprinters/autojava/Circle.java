package codesprinters.autojava;

public class Circle {

	public double getR() {
		return 0;
	}

	private double r;
	
	public Circle (double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return Math.PI * r - r;
	}

}
