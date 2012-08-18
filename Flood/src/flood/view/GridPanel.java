package flood.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel {

	private int[][] _cells;
	private final int _gridSize;

	public Color[] colorArray = { Color.blue, Color.red, Color.yellow, Color.green, Color.pink };

	public GridPanel(int gridSize) {
		_cells = new int[gridSize][gridSize];
		_gridSize = gridSize;
	}

	public void setArray(int[][] cells) {
		_cells = cells;
	}

	@Override
	public void paintComponent(Graphics g) {

		int height = this.getHeight();
		int width = this.getWidth();

		int gridDim = Math.min(height, width);
		int cellSize = gridDim / _gridSize;

		for (int i = 0; i < _gridSize; i++) {

			for (int j = 0; j < _gridSize; j++) {
				int cell = _cells[i][j];

				Color c;
				if (cell >= 0 && cell < colorArray.length) {
					c = colorArray[cell];
				} else {
					c = Color.white;
				}
				g.setColor(c);

				int xStart = cellSize * i;
				int yStart = cellSize * j;

				g.fillRect(xStart, yStart, cellSize, cellSize);
			}

		}

	}

}
