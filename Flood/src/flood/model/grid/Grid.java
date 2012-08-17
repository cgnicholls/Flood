package flood.model.grid;

public class Grid {
	private int[][] _cells;
	private int _panelSize;

	public Grid(final int[][] cells, final int panelSize) {
		_cells = cells;
		_panelSize = panelSize;
	}

	/**
	 * Returns the cell in row i and column j.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public int getCell(final int i, final int j) {
		return _cells[i][j];
	}

	/**
	 * Returns the number of cells on a side.
	 * 
	 * @return
	 */
	public int getSize() {
		return _cells.length;
	}

	public int[][] getCells() {
		return _cells;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int numCellsPerSide = _cells.length;
		for (int i = 0; i < numCellsPerSide; i++) {
			for (int j = 0; j < numCellsPerSide; j++) {
				sb.append(getCell(i, j));
				sb.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
