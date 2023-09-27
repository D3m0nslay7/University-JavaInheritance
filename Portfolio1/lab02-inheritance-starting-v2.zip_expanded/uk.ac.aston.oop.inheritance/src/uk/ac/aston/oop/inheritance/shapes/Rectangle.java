package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;

/**
 * Rectangle, Takes in x, y, width, and height
 */
public class Rectangle extends Shape {


	/**
	 * Creates a new instance.
	 *
	 * @param ulX X coordinate of the upper left corner.
	 * @param ulY Y coordinate of the upper left corner.
	 * @param Width width size of the rectangle.
	 * @param Height width size of the rectangle.
	 */
	public Rectangle(double ulX, double ulY, double width, double height) {
		super(ulX, ulY, width, height);
	}

	/**
	 * Is the draw method for the shape
	 *
	 * @param gc Is the draw GraphicsContextWrapper
	 */
	@Override
	public void draw(GraphicsContextWrapper gc) {
		gc.lineWidth(5);
		gc.rect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}

}
