package flood.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import flood.model.grid.Grid;
import flood.model.grid.GridBuilder;

/**
 * Builds a Game.
 * 
 * @author chris
 * 
 */
public class GameBuilder {

	public Game build(final int numPanels, final int panelSize) {
		GridBuilder gridBuilder = new GridBuilder();
		Grid grid = gridBuilder.build(numPanels, panelSize);

		GridPanelBuilder gridPanelBuilder = new GridPanelBuilder();
		GridPanel gridPanel = gridPanelBuilder.build(numPanels * panelSize);
		Game game = new Game(grid, gridPanel);
		initialiseGame(game, gridPanel);
		return game;
	}

	private void initialiseGame(final Game game, final GridPanel gridPanel) {
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setSize(750, 750);

		game.getContentPane().add(BorderLayout.CENTER, gridPanel);
		game.setVisible(true);
	}
}
