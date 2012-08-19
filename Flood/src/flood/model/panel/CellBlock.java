package flood.model.panel;

public class CellBlock {
	private int[][] _cells;
	private int _panelSize;

	public CellBlock(final int[][] cells, final int panelSize) {
		_cells = cells;
		_panelSize = panelSize;
	}

	/**
	 * Returns the value of cell in row i and column j.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int getCell(final int i, final int j) {
		return _cells[i][j];
	}

	/**
	 * Returns the cells array.
	 * 
	 * @return
	 */
	public int[][] getCells() {
		return _cells;
	}

	/**
	 * Returns the number of cells on one side of the panel.
	 * 
	 * @return
	 */
	public int getSize() {
		return _panelSize;
	}
}
