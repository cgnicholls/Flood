package flood.model.panel;

public class PanelRotator {

	public Panel rotateAC(final Panel panel) {
		PanelBuilder builder = new PanelBuilder();
		ArrayRotator rotator = new ArrayRotator();
		int[][] rotatedCells = rotator.rotateAC(panel.getCells());
		return builder.build(rotatedCells);
	}
}
