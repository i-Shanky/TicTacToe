package game;

import moveStrategy.DefaultUserMove;
import winStrategy.DefaultWinningStrategy;
import winStrategy.WinningStrategy;

public class GameFactory {
	public static Game create(int grid,String type1,String type2) {
		Board board = new Board(grid);
		Player player1 = null;
		
		if(type1.equals("Human")) {
			player1 = new HumanPlayer('X', new DefaultUserMove());
		}
		Player player2 = null;
		
		if(type2.equals("Human")) {
			player2 = new HumanPlayer('0', new DefaultUserMove());
		}
		WinningStrategy win = new DefaultWinningStrategy();
		return new Game(board,player1,player2,win);
	}
}
