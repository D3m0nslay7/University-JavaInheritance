package uk.ac.aston.oop.inheritance.shapes;

import javafx.scene.paint.Color;
import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;

/**
 * Filled rectangle, Takes in x, y, width, height and color
 */
public class FilledRectangle extends Rectangle {

	private Color fill;

	/**
	 * Creates a new instance.
	 *
	 * @param c Color of the filled rectangle
	 * @param ulX X coordinate of the upper left corner.
	 * @param ulY Y coordinate of the upper left corner.
	 * @param Width width size of the rectangle.
	 * @param Height width size of the rectangle.
	 */
	public FilledRectangle(Color c, double ulX, double ulY, double width, double height) {
		super(ulX, ulY, width, height);
		this.fill = c;
	}

	/**
	 * Returns the fill color of the rectangle.
	 *
	 * @return Returns the fill color of the rectangle.
	 */
	public Color getFill() {
		return this.fill;
	}
	/**
	 * Is the draw method for the shape
	 *
	 * @param gc Is the draw GraphicsContextWrapper
	 */
	@Override
	public void draw(GraphicsContextWrapper gc) {
		super.draw(gc);
		gc.fill(this.fill);
		gc.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());

		
	}
}
