package flood.model.grid;

public class GridBuilder {

	public Grid build(final int[][] cells, final int panelSize) {
		return new Grid(cells, panelSize);
	}
}
