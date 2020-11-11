package game;

import moveStrategy.MakeMoveStrategy;

public abstract class Player {
	private char symbol;
	private MakeMoveStrategy strategy;
	public Player(char symbol,MakeMoveStrategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
		this.setSymbol(symbol);
	}
	public abstract Move makeMove(Board board);
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}
