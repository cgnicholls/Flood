package flood.view;

/**
 * Builds a GridPanel.
 * 
 * @author chris
 * 
 */
public class GridPanelBuilder {

	public GridPanel build(final int gridSize) {
		int[][] cells = new int[gridSize][gridSize];
		return new GridPanel(cells, gridSize);
	}
}
