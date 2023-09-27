package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;
/**
 * frame, Takes in x, y, width, height and creates two rectangles, outer and inner
 */
public class Frame extends Shape {
	
	protected Rectangle outerRectangle;
	protected Rectangle innerRectangle;
	private static final int FRAME_THICKNESS = 10;
	
	/**
	 * Creates a new instance.
	 *
	 * @param ulX X coordinate of the upper left corner.
	 * @param ulY Y coordinate of the upper left corner.
	 * @param Width width size of the rectangle.
	 * @param Height width size of the rectangle.
	 */
	public Frame(double ulX, double ulY, double width, double height) {
		super(ulX, ulY, width, height);
		outerRectangle = new Rectangle(ulX, ulY, width, height);
		innerRectangle = new Rectangle(ulX + FRAME_THICKNESS, ulY + FRAME_THICKNESS, width - (FRAME_THICKNESS * 2), height - (FRAME_THICKNESS * 2));
	}
	/**
	 * Is the draw method for the shape
	 *
	 * @param gc Is the draw GraphicsContextWrapper
	 */
	@Override
	public void draw(GraphicsContextWrapper gc) {
		outerRectangle.draw(gc);
		innerRectangle.draw(gc);
	}

}
