package fr.htc.java.oo;

public class Circle {

	public double x, y;
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	public double area() {
		return Math.PI * Math.pow(r, 2);
	}

}
