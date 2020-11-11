package game;

public class Move {
	private int x,y;
	private char symbol;
	public Move(int x,int y,char symbol) {
		this.setX(x);
		this.setY(y);
		this.setSymbol(symbol);
	}
	public Move() {
		setX(-1);
		setY(-1);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

}
