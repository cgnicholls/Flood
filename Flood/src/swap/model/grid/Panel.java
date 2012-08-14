package swap.model.grid;

public class Panel {
	private int[] _cells;
	private final int _panelSize;

	public Panel(final int panelSize) {
		_panelSize = Math.max(1, panelSize);
		_cells = new int[_panelSize * _panelSize];
	}

	public void initialise() {
		for (int x = 1; x <= _panelSize; x++) {
			for (int y = 1; y <= _panelSize; y++) {
				_cells[index(x, y)] = 0;
			}
		}
	}

	/**
	 * Returns the index for the cell (x,y), with (1,1) being the top left.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int index(final int x, final int y) {
		return _panelSize * (y - 1) + (x - 1);
	}

	/**
	 * Returns the value of cell (x,y), with (1,1) being the top left.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int getCell(final int x, final int y) {
		return _cells[index(x, y)];
	}

	protected void setCell(final int x, final int y, final int value) {
		_cells[index(x, y)] = value;
	}
}
