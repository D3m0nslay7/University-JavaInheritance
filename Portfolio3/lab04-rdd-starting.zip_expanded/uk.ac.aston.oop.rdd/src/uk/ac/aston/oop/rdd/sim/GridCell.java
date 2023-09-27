package uk.ac.aston.oop.rdd.sim;

import java.util.ArrayList;
import java.util.Random;

public class GridCell {

	private final ArrayList<Actor> contents;
	
	private final int row;
	private final int column;
	private final Grid grid;
	
	public GridCell(Grid g, int r, int c) {
		contents = new ArrayList<Actor>();
		
		this.grid = g;
		this.row = r;
		this.column = c;
		
		
	}
	
	public Grid getGrid() {
		return this.grid;
	}
	public int getRow() {
		return this.row;
	}
	public int getColumn() {
		return this.column;
	}
	public ArrayList<Actor> getContents(){
		return this.contents;
	}	
	
	public ArrayList<GridCell> getAdjacent(){
		ArrayList<GridCell> results = new ArrayList<GridCell>();
		for (int i = this.getRow() - 1; i <= this.getRow() + 1 ; i++) {
			for (int j = this.getColumn() - 1; j <= this.getColumn() + 1; j++) {
				if(this.getRow() == i && this.getColumn() == j) {
					
				}else {
					if(i >= 0 && grid.getHeight() - 1 >= i && j >= 0 && grid.getWidth() - 1 >= j) {
						results.add(grid.get(i, j));
					}
				}
			}
		}
		return results;
	}
	
	public ArrayList<GridCell> getFreeAdjacent(){
		ArrayList<GridCell> results = new ArrayList<GridCell>();
		for (int i = this.getRow() - 1; i <= this.getRow() + 1 ; i++) {
			for (int j = this.getColumn() - 1; j <= this.getColumn() + 1; j++) {
				if(this.getRow() == i && this.getColumn() == j) {
					
				}else {
					if(i >= 0 && grid.getHeight() - 1 >= i && j >= 0 && grid.getWidth() - 1 >= j) {		
						if (grid.get(i, j).getContents().isEmpty()) {
							results.add(grid.get(i, j));
						}
					}
				}
			}
		}
		return results;
	}
	
	public GridCell getRandomFreeAdjacent(Random rnd) {
		ArrayList<GridCell> freeAdjacent = getFreeAdjacent();
		if (freeAdjacent.isEmpty()){
			return null;
		}
		else {
			int random = rnd.nextInt(freeAdjacent.size());
			return freeAdjacent.get(random);
		}
	}
}
