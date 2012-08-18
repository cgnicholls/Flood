package flood.view.graphics;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import flood.view.GridPanel;

public class GraphicsBuilder {

	private GridPanel gridPanel;

	JFrame frame;

	public void initializeGraphics() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);

		gridPanel = new GridPanel(3);

		JButton newGameButton = new JButton("New Game");
		newGameButton.addActionListener(new NewGameButtonListener());

		frame.getContentPane().add(BorderLayout.CENTER, gridPanel);
		frame.getContentPane().add(BorderLayout.NORTH, newGameButton);

		int xCells = 3;
		int[][] cells = new int[xCells][xCells];
		for (int i = 0; i < xCells; i++) {
			for (int j = 0; j < xCells; j++) {
				int col = (int) (Math.random() * 6);
				cells[i][j] = col;
			}
		}

		gridPanel.setArray(cells);

		frame.repaint();
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
