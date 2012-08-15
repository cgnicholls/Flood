package flood.model.panel;


/**
 * A factory to build a Panel.
 * 
 * @author chris
 * 
 */
public class PanelBuilder {
	public Panel build(final int[][] cells) {
		return new Panel(cells, cells.length);
	}
}
