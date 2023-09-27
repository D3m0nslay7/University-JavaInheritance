package uk.ac.aston.oop.acint.shapes;

import uk.ac.aston.oop.acint.util.GraphicsContextWrapper;

public class Cross implements Drawable {

	protected static final int SIZE = 20;

	private double centerX;
	private double centerY;

	public Cross(double cX, double cY) {
		this.centerX = cX;
		this.centerY = cY;
	}
	
	@Override
	public void draw(GraphicsContextWrapper gc) {
		gc.line(centerX - SIZE / 2, centerY - SIZE / 2, centerX + SIZE / 2, centerY + SIZE / 2);
		gc.line(centerX + SIZE / 2, centerY - SIZE / 2, centerX - SIZE / 2, centerY + SIZE / 2);
	}

	@Override
	public void move(GraphicsContextWrapper gc, double dx, double dy) {
		centerX += dx;
		centerY += dy;
		//check if we clip the side of the map X
		if(centerX + (SIZE / 2) >= gc.width()) {
			centerX = gc.width() - SIZE / 2;
		}
		//check if we clip the side of the map X
		if(centerY + (SIZE / 2) >= gc.height()) {
			centerY = gc.height() - SIZE / 2;
		}
		
	}
}
