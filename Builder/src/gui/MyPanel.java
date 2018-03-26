package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	final int B_WIDTH = 920;
	final int B_HEIGHT = 720;

	public MyPanel() {
		init();
	}

	private void init() {
		setBackground(Color.white);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		setDoubleBuffered(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
