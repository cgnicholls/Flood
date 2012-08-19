package flood.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel {

	private int[][] _cells;
	private int _gridSize;
	private int _cellSize;

	public Color[] colorArray = { Color.blue, Color.red, Color.yellow, Color.green, Color.pink, Color.orange };

	public int getCellSize() {
		return _cellSize;
	}

	public void setColorArray(Color p1Color, Color p2Color) {
		Color[] toCheck = colorArray.clone();

		// Set first two values to player's colors
		colorArray[0] = p1Color;
		colorArray[1] = p2Color;

		int nextIndex = 2;
		for (Color c : toCheck) {
			if (c != p1Color & c != p2Color) {
				colorArray[nextIndex] = c;
				nextIndex++;
			}
		}
	}

	public GridPanel(int gridSize) {
		_cells = new int[gridSize][gridSize];
		_gridSize = gridSize;
	}

	public void setArray(int[][] cells) {
		_cells = cells;
		_gridSize = _cells.length;
	}

	@Override
	public void paintComponent(Graphics g) {

		int height = this.getHeight();
		int width = this.getWidth();

		int gridDim = Math.min(height, width);
		_cellSize = gridDim / _gridSize;

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

				int xStart = _cellSize * i;
				int yStart = _cellSize * j;

				g.fillRect(xStart, yStart, _cellSize, _cellSize);
			}

		}

	}

}
