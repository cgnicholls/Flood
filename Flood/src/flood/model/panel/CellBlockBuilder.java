package flood.model.panel;

/**
 * A factory to build a Panel.
 * 
 * @author chris
 * 
 */
public class CellBlockBuilder {
	public CellBlock build(final int[][] cells) {
		return new CellBlock(cells, cells.length);
	}
}
