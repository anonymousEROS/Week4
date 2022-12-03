package ch6;

import javax.swing.JFrame;

public class DieGUI {

	public static void main(String[] args) {
		 JFrame frame = new JFrame ("My Die Game ");
		    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		    DiePanel panel = new DiePanel();
		    frame.getContentPane().add(panel);

		    frame.pack();
		    frame.setVisible(true);

	}

}
