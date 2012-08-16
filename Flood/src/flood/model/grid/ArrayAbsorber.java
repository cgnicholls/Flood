package flood.model.grid;

import java.util.TreeMap;

/**
 * Absorbs a colour into a particular region.
 * 
 * @author chris
 * 
 */
public class ArrayAbsorber {

	private TreeMap<String, Boolean> _visited;
	private int[][] _cells;
	private int _cellsLength;

	public ArrayAbsorber(final int[][] cells) {
		_visited = new TreeMap<String, Boolean>();
		_cells = cells;
		_cellsLength = cells.length;
	}

	public void absorb(final int iStart, final int jStart,
			final int colourToAbsorb) {
		absorb(iStart, jStart, _cells[iStart][jStart], colourToAbsorb);
	}

	protected void absorb(final int i, final int j, final int regionColour,
			final int colourToAbsorb) {
		if (outOfBounds(i, j)) {
			return;
		}
		if (_visited.containsKey(buildKey(i, j))) {
			return;
		}

		_visited.put(buildKey(i, j), true);

		if (_cells[i][j] == colourToAbsorb) {
			_cells[i][j] = regionColour;
		}

		if (_cells[i][j] == regionColour) {
			absorb(i - 1, j, regionColour, colourToAbsorb);
			absorb(i + 1, j, regionColour, colourToAbsorb);
			absorb(i, j - 1, regionColour, colourToAbsorb);
			absorb(i, j + 1, regionColour, colourToAbsorb);
		}
	}

	private boolean outOfBounds(final int i, final int j) {
		return i < 0 || i >= _cellsLength || j < 0 || j >= _cellsLength;
	}

	private String buildKey(int i, int j) {
		StringBuilder sb = new StringBuilder();
		sb.append(i);
		sb.append(",");
		sb.append(j);
		return sb.toString();
	}
}
