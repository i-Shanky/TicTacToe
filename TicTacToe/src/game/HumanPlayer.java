package game;
import java.util.Scanner;
import moveStrategy.MakeMoveStrategy;

public class HumanPlayer extends Player {
	MakeMoveStrategy strategy;
	int x,y;
	static Scanner sc = new Scanner(System.in);
	public HumanPlayer(char symbol, MakeMoveStrategy strategy) {
		super(symbol, strategy);
		this.strategy=strategy;
	}

	@Override
	public Move makeMove(Board b) {
		System.out.println("Enter the coodinates :");
		this.x = Integer.parseInt(sc.next());
		this.y = Integer.parseInt(sc.next());
		Move move = new Move(x,y,this.getSymbol());
		b = strategy.nextMove(move,b);
		return move;
	}


}
