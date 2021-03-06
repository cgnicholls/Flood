package flood.model.grid;

public class Grid {
	private final int[][] _cells;
	private final int _blockSize;

	public Grid(final int[][] cells, final int blockSize) {
		_cells = cells;
		_blockSize = blockSize;
	}

	/**
	 * Makes a move at cell i, j in the game. If the move is next to a region
	 * belonging to the player, then the region absorbs all cells of colour i, j
	 * connected to it.
	 * 
	 * @param i
	 * @param j
	 * @param playerColour
	 */
	public void move(int i, int j, int playerColour) {
		if (cellConnectsToPlayerRegion(i, j, _cells, playerColour)) {
			ArrayAbsorber absorber = new ArrayAbsorber(_cells);
			absorber.absorb(i, j, getCell(i, j));
		}
	}

	/**
	 * Returns whether or not the cell at i, j is adjacent to a cell of
	 * playerColour.
	 * 
	 * @param i
	 * @param j
	 * @param playerColour
	 * @return
	 */
	protected boolean cellConnectsToPlayerRegion(int i, int j, int[][] cells, int playerColour) {
		if (cells[i - 1][j] == playerColour) {
			return true;
		} else if (cells[i + 1][j] == playerColour) {
			return true;
		} else if (cells[i][j - 1] == playerColour) {
			return true;
		} else if (cells[i][j + 1] == playerColour) {
			return true;
		}
		return false;
	}

	/**
	 * Returns whether or not the cells array has an ith row and a jth column.
	 * 
	 * @param i
	 * @param j
	 * @param cells
	 * @return
	 */
	protected boolean cellExistsInArray(int i, int j, int[][] cells) {
		if (cells == null) {
			return false;
		}
		int height = cells.length;
		if (i < 0 || i >= height) {
			return false;
		}
		int width = cells[0].length;
		if (j < 0 || j >= width) {
			return false;
		}
		return true;
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

	/**
	 * Returns the cells array.
	 * 
	 * @return
	 */
	public int[][] getCells() {
		return _cells;
	}

	/**
	 * Returns a String representation of the Grid.
	 */
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

	/**
	 * Set the cell at row i, column j to value c.
	 * 
	 * @param i
	 * @param j
	 * @param c
	 */
	public void setCell(int i, int j, int c) {
		_cells[i][j] = c;
	}
}
