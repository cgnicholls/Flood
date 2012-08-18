package flood.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel {

	private final int[][] _cells;
	private final int _gridSize;

	private enum Colours {
		RED, BLUE, GREEN
	};

	public GridPanel(int gridSize) {
		_cells = new int[gridSize][gridSize];
		_gridSize = gridSize;
	}

	@Override
	public void paintComponent(Graphics g) {

		int height = this.getHeight();
		int width = this.getWidth();

		int gridDim = Math.min(height, width);
		int cellSize = gridDim / _gridSize;

		for (int i = 0; i < _gridSize; i++) {

			for (int j = 0; i < _gridSize; j++) {
				int cell = _cells[i][j];
				g.setColor(GetColour(cell));

			}

		}

	}

	public Color GetColour(int enumVal) {
		Color c = Color.blue;

		return c;
	}

}
