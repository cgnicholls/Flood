package flood.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel {

	private int[][] _cells;
	private int _gridSize;

	public Color[] colorArray = { Color.blue, Color.red, Color.yellow, Color.green, Color.pink, Color.orange };

	public GridPanel(final int[][] cells, final int gridSize) {
		_cells = cells;
		_gridSize = gridSize;
	}

	/**
	 * Put player 1's colour in 0th place in colour array, player 2's colour in
	 * 1st place, and the other colours are sequentially added to the colour
	 * array.
	 * 
	 * @param p1Color
	 * @param p2Color
	 */
	public void setColorArray(Color p1Color, Color p2Color) {
		Color[] toCheck = colorArray.clone();

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

	@Override
	public void paintComponent(Graphics g) {

		int height = this.getHeight();
		int width = this.getWidth();

		int gridDim = Math.min(height, width);
		int cellSize = gridDim / _gridSize;

		for (int i = 0; i < _gridSize; i++) {
			for (int j = 0; j < _gridSize; j++) {
				int cell = _cells[i][j];

				Color color = selectColor(cell);
				g.setColor(color);

				int xStart = cellSize * i;
				int yStart = cellSize * j;

				g.fillRect(xStart, yStart, cellSize, cellSize);
			}
		}
	}

	public void setArray(int[][] cells) {
		_cells = cells;
		_gridSize = _cells.length;
	}

	public Color selectColor(int colRef) {
		Color color;

		if (colRef >= 0 && colRef < colorArray.length) {
			color = colorArray[colRef];
		} else {
			color = Color.white;
		}

		return color;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int numCellsPerSide = _cells.length;
		for (int i = 0; i < numCellsPerSide; i++) {
			for (int j = 0; j < numCellsPerSide; j++) {
				sb.append(_cells[i][j]);
				sb.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
