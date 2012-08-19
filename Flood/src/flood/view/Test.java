package flood.view;

public class Test {

	public static void main(String[] args) {

		GameBuilder gameBuilder = new GameBuilder();
		Game game = gameBuilder.build(2, 3);
		game.start();
	}
}
