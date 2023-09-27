package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;

/**
 * Shape, Takes in x, y, width, and height
 */
public class Shape {
	private double upperLeftX, upperLeftY;
	private double width, height;

	/**
	 * Creates a new instance.
	 *
	 * @param leftX X coordinate of the upper left corner.
	 * @param leftY Y coordinate of the upper left corner.
	 * @param Width width size of the shape.
	 * @param Height width size of the shape.
	 */
	public Shape(double leftX, double leftY, double Width, double Height) {
		this.upperLeftX = leftX;
		this.upperLeftY = leftY;
		this.width = Width;
		this.height = Height;

	}

	// getting the variables
	/**
	 * Returns the X coordinate of the upper left corner.
	 *
	 * @return X coordinate of upper left corner.
	 */
	public double getX() {
		return upperLeftX;
	}
	/**
	 * Returns the Y coordinate of the upper left corner.
	 *
	 * @return Y coordinate of upper left corner.
	 */
	public double getY() {
		return upperLeftY;
	}
	/**
	 * Returns the width of the shape.
	 *
	 * @return Returns the width of the shape.
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * Returns the height of the shape.
	 *
	 * @return Returns the height of the shape.
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * Is the draw method for the shape
	 *
	 * @param gc Is the draw GraphicsContextWrapper
	 */
	public void draw(GraphicsContextWrapper gc) {
		System.out.println("Cant really draw Shape");
	}

}
