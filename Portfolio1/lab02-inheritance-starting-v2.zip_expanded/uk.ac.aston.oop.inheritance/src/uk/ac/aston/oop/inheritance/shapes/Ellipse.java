package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;
/**
 * Ellipse, Takes in x, y, width, and height
 */
public class Ellipse extends Shape {


	/**
	 * Creates a new instance.
	 *
	 * @param ulX X coordinate of the upper left corner.
	 * @param ulY Y coordinate of the upper left corner.
	 * @param Width width size of the shape.
	 * @param Height width size of the shape.
	 */
	public Ellipse(double ulX, double ulY, double width, double height) {
		super(ulX, ulY, width, height);
	}

	/**
	 * Is the draw method for the shape
	 *
	 * @param gc Is the draw GraphicsContextWrapper
	 */
	@Override
	public void draw(GraphicsContextWrapper gc) {
		gc.oval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	
}
