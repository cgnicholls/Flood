package flood.model.grid;

import flood.model.panel.Panel;

public class GridBuilder {

	public Grid build(final Panel[][] panels) {
		int numPanelsPerSide = panels.length;
		int panelSize = panels[0][0].getPanelSize();
		return new Grid(panelSize, numPanelsPerSide, panels);
	}
}
