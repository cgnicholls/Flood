package flood.model.grid;

import flood.model.panel.Panel;

public class Grid {
	private Panel[][] _panels;
	private int _panelSize;
	private int _numPanelsPerSide;

	public Grid(final int panelSize, final int numPanelsPerSide,
			final Panel[][] panels) {
		_panelSize = panelSize;
		_numPanelsPerSide = numPanelsPerSide;
		_panels = panels;
	}

	/**
	 * Returns the cell in row i and column j.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public int getCell(final int i, final int j) {
		int pi = (int) i / _panelSize;
		int pj = (int) i / _panelSize;
		int celli = i % _panelSize;
		int cellj = j % _panelSize;
		Panel panel = _panels[pi][pj];
		return panel.getCell(celli, cellj);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int numCellsPerSide = _panelSize * _numPanelsPerSide;
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
