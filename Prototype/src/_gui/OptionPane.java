package _gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OptionPane {
	public OptionPane(MyPanel panelM) {
		JFrame frame = new JFrame("Message Dialog Box");
		  JButton button = new JButton("Click here to restart with editor");
		  	button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					panelM.resetEditor();
					panelM.repaint();
				}
			});
		  JPanel panel = new JPanel();
		  panel.add(button);
		  frame.add(panel);
		  frame.setResizable(false);
		  frame.setLocationRelativeTo(null);
		  frame.setSize(250, 100);
		  frame.setVisible(true);
	}
}
