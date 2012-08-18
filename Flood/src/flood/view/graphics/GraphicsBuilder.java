package flood.view.graphics;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import flood.view.GridPanel;

public class GraphicsBuilder {

	private GridPanel gridPanel;

	public void initializeGraphics() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 350);
		frame.setVisible(true);

		gridPanel = new GridPanel(2);

		JButton newGameButton = new JButton("New Game");

		frame.getContentPane().add(BorderLayout.CENTER, gridPanel);
		frame.getContentPane().add(BorderLayout.NORTH, newGameButton);
	}

	class NewGameButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// New Game code here
			JButton b = (JButton) e.getSource();
			b.setText("New Game Code Not Yet Implemented");
		}
	}

}
