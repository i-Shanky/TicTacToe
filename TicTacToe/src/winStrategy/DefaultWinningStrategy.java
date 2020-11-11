package winStrategy;

import game.Board;
import game.Move;

public class DefaultWinningStrategy implements WinningStrategy {

	@Override
	public boolean checkWinner(Board b,Move move) {
		int x = move.getX();
		int y = move.getY();
		char symbol = move.getSymbol();
		char grid[][] = b.getGrid();
		//Diagonal checks
		if(x==y) {
			for(int i=1;i<grid.length;i++) {
				if(grid[i][i]!=symbol)
					break;
				if(i==grid.length-1)
					return true;
			}
			for(int i=grid.length-1;i>=0;i--) {
				if(grid[grid.length-1-i][i]!=symbol)
					break;
				if(i==0)
					return true;
			}
		}
		//Check for vertical
		for(int i=0;i<grid.length;i++) {
			if(grid[x][i]!=symbol)
				break;
			if(i==grid.length-1)
				return true;
		}
		//Check for horizontal
		for(int i=0;i<grid.length;i++) {
			if(grid[i][y]!=symbol)
				break;
			if(i==grid.length-1)
				return true;
		}
		return false;
	}

}
