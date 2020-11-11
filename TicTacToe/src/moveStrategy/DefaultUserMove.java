package moveStrategy;

import game.Board;
import game.Move;

public class DefaultUserMove implements MakeMoveStrategy {
	private int x,y;
	public DefaultUserMove() {
		x = -1;
		y = -1;
	}

	@Override
	public Board nextMove(Move move,Board b) {
		char grid[][] = b.getGrid();
		this.x = move.getX();
		this.y=move.getY();
		if(x<0||y<0||x>grid.length||y>grid.length) {
			System.out.println("Invalid move!!");
			return b;
		}
		if(grid[x][y]!='\u0000') {
			System.out.println("Cell already filled!");
			return b;
		}
		grid[x][y]=move.getSymbol();
		b.setGrid(grid);
		return b;
	}
	
}
