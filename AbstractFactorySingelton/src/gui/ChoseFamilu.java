package gui;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChoseFamilu {

	public ChoseFamilu(){
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();

		JOptionPane j = new JOptionPane();
		JOptionPane.showMessageDialog(frame, "SELEZIONA LA FAMIGLIA");
		panel.add(j);
		frame.add(panel);
	}
	
}
