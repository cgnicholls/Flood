package flood.model.grid;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGrid {

	@Test
	public void testCellExistsInArray() {
		Grid grid = new Grid(null, 0);
		int[][] cells = new int[2][2];
		assertEquals(true, grid.cellExistsInArray(0, 0, cells));
		assertEquals(true, grid.cellExistsInArray(0, 1, cells));
		assertEquals(true, grid.cellExistsInArray(1, 0, cells));
		assertEquals(true, grid.cellExistsInArray(1, 1, cells));

		assertEquals(false, grid.cellExistsInArray(-1, 0, cells));
		assertEquals(false, grid.cellExistsInArray(0, -1, cells));
		assertEquals(false, grid.cellExistsInArray(2, 0, cells));
		assertEquals(false, grid.cellExistsInArray(0, 2, cells));
	}
}
