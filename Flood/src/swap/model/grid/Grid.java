package swap.model.grid;

public class Grid {
	private Panel[] _panels;
	private int _panelSize;
	private int _numPanelsPerSide;

	public Grid(final int panelSize, final int numPanelsPerSide) {
		_panelSize = Math.max(1, panelSize);
		_numPanelsPerSide = Math.max(1, numPanelsPerSide);
		_panels = new Panel[_numPanelsPerSide * _numPanelsPerSide];
		for (int i = 0; i < _numPanelsPerSide * _numPanelsPerSide; i++) {
			_panels[i] = new Panel(_panelSize);
		}
	}

	public void interchangePanels(final int panelIndex1, final int panelIndex2) {

	}

	public void rotatePanelCW(final int panelIndex, final int rotations) {

	}

	public void initialise() {
		for (int px = 1; px <= _numPanelsPerSide; px++) {
			for (int py = 1; py <= _numPanelsPerSide; py++) {
				Panel panel = getPanel(px, py);
				panel.initialise();
			}
		}
	}

	public void absorb(final int startCellIndex, final int cellState) {

	}

	/**
	 * Returns the index in the _panels array of the panel at (x,y), with (1,1)
	 * being top left.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int panelIndex(final int x, final int y) {
		return (y - 1) * _numPanelsPerSide + (x - 1);
	}

	public Panel getPanel(final int x, final int y) {
		return _panels[panelIndex(x, y)];
	}

	/**
	 * Returns the cell at (x,y), with (1,1) being the top left.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int getCell(final int x, final int y) {
		int px = (int) (x - 1) / _panelSize + 1;
		int py = (int) (y - 1) / _panelSize + 1;
		int cellx = (x - 1) % _panelSize + 1;
		int celly = (y - 1) % _panelSize + 1;
		Panel panel = getPanel(px, py);
		return panel.getCell(cellx, celly);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int numCellsPerSide = _panelSize * _numPanelsPerSide;
		for (int x = 1; x <= numCellsPerSide; x++) {
			for (int y = 1; y <= numCellsPerSide; y++) {
				sb.append(getCell(x, y));
				sb.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
