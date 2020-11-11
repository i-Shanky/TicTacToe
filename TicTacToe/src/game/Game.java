package game;

import winStrategy.WinningStrategy;

public class Game {
	Board board;
	Player player2;
	Player player1;
	boolean curr_player; //true for 1st player, false for 2nd player
	WinningStrategy strat;
	public Game(Board board,Player player1,Player player2,WinningStrategy strat) {
		// TODO Auto-generated constructor stub
		this.board=board;
		this.player1=player1;
		this.player2=player2;
		curr_player = true;
		this.strat=strat;
	}
		
	public void run() {
		Move curr_move = null;
		int numberOfMoves = board.getDimension()*board.getDimension();
		while(numberOfMoves-->0) {
			if(curr_player)
				curr_move = player1.makeMove(board);
			else
				curr_move = player2.makeMove(board);
			board.display();
			if(strat.checkWinner(board, curr_move)) {
				if(curr_player)
					System.out.println("Player1 is the winner!!");
				else
					System.out.println("Player2 is the winner!!");
				break;
			}
			curr_player=!curr_player;
		}
		if(numberOfMoves==0) {
			System.out.println("Match Draw!!");
		}
	}

}
