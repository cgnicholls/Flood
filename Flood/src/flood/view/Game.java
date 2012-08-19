package flood.view;

import javax.swing.JFrame;

import flood.model.grid.Grid;

public class Game extends JFrame {

	private final Grid _grid;
	private final GridPanel _gridPanel;

	public Game(final Grid grid, final GridPanel gridPanel) {
		_grid = grid;
		_gridPanel = gridPanel;
	}

	/**
	 * Initialises the Grid with random numbers between 0 and 5.
	 */
	public void initialiseGrid() {
		int cellsSize = _grid.getSize();
		for (int i = 0; i < cellsSize; i++) {
			for (int j = 0; j < cellsSize; j++) {
				int c = (int) (Math.random() * 6);
				_grid.setCell(i, j, c);
			}
		}
		_grid.setCell(0, 0, 0);
		_grid.setCell(0, 1, 0);
	}

	/**
	 * Initialises the Grid with colours and starts the game loop.
	 */
	public void start() {
		initialiseGrid();
		_gridPanel.setArray(_grid.getCells());
		run();
	}

	/**
	 * The game loop takes input from each player in turn and renders the updated
	 * Grid to the GridPanel.
	 * 
	 */
	protected void run() {
		_grid.move(0, 1, 0);
		renderToGridPanel(_grid.getCells());
		repaint();
	}

	protected void renderToGridPanel(final int[][] cells) {
		_gridPanel.setArray(_grid.getCells());
	}
}
