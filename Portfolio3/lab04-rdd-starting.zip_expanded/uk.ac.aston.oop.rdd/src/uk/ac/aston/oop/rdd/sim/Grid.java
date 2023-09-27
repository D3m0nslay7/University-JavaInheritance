package uk.ac.aston.oop.rdd.sim;

public class Grid {
	private final int width;
	private final int height;
	
	private final GridCell[][] rows;
	
	public Grid(int h, int w) {
		width = w;
		height = h;
		rows = new GridCell[height][];
		for (int i = 0; i < height; i++) {
			rows[i] = new GridCell[width];
			
			for (int j = 0; j < width; j++) {
				rows[i][j] = new GridCell(this,i,j);
			}
		}
	}
	
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public GridCell get(int r, int c) {
		return rows[r][c];
	}
}
