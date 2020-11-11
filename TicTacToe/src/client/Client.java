package client;
import java.util.*;
import game.Game;
import game.GameFactory;
public class Client {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int grid_size;
		String player1_type,player2_type;
		System.out.println("Enter grid size - ");
		grid_size = Integer.parseInt(sc.nextLine());
		System.out.println("Enter player 1 type: ");
		player1_type = sc.nextLine();
		System.out.println("Enter player 2 type: ");
		player2_type = sc.nextLine();
		Game newGame = GameFactory.create(grid_size, player1_type, player2_type);
		newGame.run();
	}

}
