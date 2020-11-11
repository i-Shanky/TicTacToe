package winStrategy;

import game.Board;
import game.Move;

public interface WinningStrategy {
	public boolean checkWinner(Board b,Move move);
}
