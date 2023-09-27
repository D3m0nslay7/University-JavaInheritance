package uk.ac.aston.oop.acint.shapes;

import uk.ac.aston.oop.acint.util.GraphicsContextWrapper;

public abstract class Shape implements Drawable{

	private double upperLeftX, upperLeftY;
	protected double width, height;

	public Shape(double ulX, double ulY, double width, double height) {
		this.upperLeftX = ulX;
		this.upperLeftY = ulY;
		this.width  = width;
		this.height = height;
	}

	public double getX() { return upperLeftX; }

	public double getY() { return upperLeftY; }

	public double getWidth()  { return width;  }

	public double getHeight() { return height; }
	
	@Override
	public void move(GraphicsContextWrapper gc, double dx, double dy) {
		
		this.upperLeftX = this.getX() + dx;
		this.upperLeftY = this.getY() + dy;
		
		//check if we clip the side of the map X
		if(this.getX() + this.getWidth() >= gc.width()) {
			this.upperLeftX = gc.width() - this.getWidth();
		}
		//check if we clip the side of the map Y
		if(this.getY() + this.getHeight() >= gc.height()) {
			this.upperLeftY = gc.height() - this.getHeight();
		}
	}


}
