package flood.model.grid;

/**
 * Builds a Grid with int[][] cells initialised to zero.
 * 
 * @author chris
 * 
 */
public class GridBuilder {

	public Grid build(final int numPanels, final int panelSize) {
		int[][] cells = buildCells(numPanels, panelSize);
		return new Grid(cells, panelSize);
	}

	private int[][] buildCells(final int numPanels, final int panelSize) {
		int numCells = numPanels * panelSize;
		int[][] cells = new int[numCells][numCells];

		for (int i = 0; i < numCells; i++) {
			for (int j = 0; j < numCells; j++) {
				cells[i][j] = 0;
			}
		}
		return cells;
	}
}
