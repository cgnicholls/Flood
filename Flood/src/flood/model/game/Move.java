package flood.model.game;

import flood.model.grid.ArrayAbsorber;
import flood.model.grid.Grid;

public class Move {
	private Grid _grid;

	public Move(final Grid grid) {
		_grid = grid;
	}

	public void move(int i, int j, int playerColour) {
		ArrayAbsorber absorber = new ArrayAbsorber(_grid.getCells());
		boolean bNextToPlayerRegion = false;
		if (_grid.getCell(i - 1, j) == playerColour) {
			bNextToPlayerRegion = true;
		} else if (_grid.getCell(i + 1, j) == playerColour) {
			bNextToPlayerRegion = true;
		} else if (_grid.getCell(i, j - 1) == playerColour) {
			bNextToPlayerRegion = true;
		} else if (_grid.getCell(i, j + 1) == playerColour) {
			bNextToPlayerRegion = true;
		}
		if (bNextToPlayerRegion) {
			absorber.absorb(i, j, _grid.getCell(i, j));
		}
	}
}
