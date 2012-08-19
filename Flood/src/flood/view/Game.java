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
	}

	/**
	 * Initialises the Grid with colours and starts the game loop.
	 */
	public void start() {
		initialiseGrid();
		System.out.println(_grid.toString());
		_gridPanel.setArray(_grid.getCells());
		System.out.println(_gridPanel);
	}

	// public void run() {
	// _grid.move(i, j, playerColour);
	// renderToGridPanel(_grid);
	// }

}
