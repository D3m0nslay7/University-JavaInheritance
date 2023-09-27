package uk.ac.aston.oop.inheritance.shapes;

/**
 * Circle, specified as center + radius. Takes in x y and radius
 */
public class Circle extends Ellipse {

	/**
	 * Creates a new instance.
	 *
	 * @param centerX X coordinate of the center.
	 * @param centerY Y coordinate of the center.
	 * @param radius radius size of the circle.
	 */
	public Circle(double centerX, double centerY, double radius) {
		super(centerX - radius, centerY - radius, radius * 2, radius * 2);
	}

	/**
	 * Is the draw method for the shape
	 *
	 * @param gc Is the draw GraphicsContextWrapper
	 */
	public double getRadius() {
		return super.getWidth() / 2;
	}

}
