package game;

public class Board {
	private int dimension;
	private char grid[][];
	public Board(int dimension) {
		this.dimension=dimension;
		this.grid = new char[dimension][dimension];
		// TODO Auto-generated constructor stub
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public char[][] getGrid() {
		return grid;
	}
	public void setGrid(char[][] grid) {
		this.grid = grid;
	}
	
	public void display() {
		for(char ch[]:grid) {
			for(char cell:ch) {
				System.out.print(cell+" ");
			}
			System.out.println();
		}
	}

}
