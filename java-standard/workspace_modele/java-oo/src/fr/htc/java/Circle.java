package fr.htc.java;

/**
 * 
 * la classe circle
 *
 */
public class Circle {
/**
 * 
 */
	public double x, y;
	public double r;

	/**
	 * 
	 * @param r
	 */
	public Circle(double r) {
		this.r = r;
	}

	public Circle(double x, double y, double r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public double area() {
		return Math.PI * Math.pow(r, 2);
	}

}
