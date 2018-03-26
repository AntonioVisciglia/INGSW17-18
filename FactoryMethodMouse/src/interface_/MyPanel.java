package interface_;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import costructor_.*;
import productor_.*;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	final int B_WIDTH = 920;
	final int B_HEIGHT = 720;
	CostructorShape costructor;
	ProductorShape productor;

	public MyPanel() {
		init();
	}

	private void init() {
		setBackground(Color.white);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		setDoubleBuffered(true);
		costructor = new CostructorBlackPapillon();
		productor = costructor.getShape();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		costructor.drawShape(g);
	}
}
