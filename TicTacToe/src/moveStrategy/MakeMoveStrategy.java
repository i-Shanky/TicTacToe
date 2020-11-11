package moveStrategy;

import game.Board;
import game.Move;

public interface MakeMoveStrategy {
	public abstract Board nextMove(Move move,Board board);
}
