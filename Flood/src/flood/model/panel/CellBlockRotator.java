package flood.model.panel;

public class CellBlockRotator {

	public CellBlock rotateAC(final CellBlock panel) {
		CellBlockBuilder builder = new CellBlockBuilder();
		ArrayRotator rotator = new ArrayRotator();
		int[][] rotatedCells = rotator.rotateAC(panel.getCells());
		return builder.build(rotatedCells);
	}
}
