package flood.model.grid;

import org.junit.Test;

import flood.model.grid.Grid;


public class TestGrid {
	@Test
	public void testToString() {
		Grid grid = new Grid(3, 2);
		grid.initialise();
		System.out.println(grid);
	}
}
