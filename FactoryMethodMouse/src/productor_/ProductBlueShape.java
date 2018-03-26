package productor_;

import java.awt.Color;
import java.awt.Graphics;

public class ProductBlueShape extends ProductorShape {

	@Override
	public void makeFace(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(300, 200, 300, 300);
	}

	@Override
	public void makeEars(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(270, 150, 100, 100);
		g.fillOval(530, 150, 100, 100);
	}

	@Override
	public void makeEyes(Graphics g) {
		//bulbi
		g.setColor(Color.white);
			g.fillOval(360, 275, 50, 50);
			g.fillOval(490, 275, 50, 50);
		//pupille
		g.setColor(Color.black);
			g.fillOval(375, 290, 20, 20);
			g.fillOval(505, 290, 20, 20);
	}

	@Override
	public void makeMustacces(Graphics g) {
		g.setColor(Color.darkGray);
			//sx
			g.drawLine(370,390,220,375);
			g.drawLine(370,405,220,405);
			g.drawLine(370,420,220,440);
			//dx
			g.drawLine(525,390,670,375);
			g.drawLine(525,405,670,405);
			g.drawLine(525,420,670,440);
			
	}

	@Override
	public void makePapillon(Graphics g) {
		g.setColor(Color.red);
		g.translate(-25, 0);
		g.fillPolygon(new int[] {600, 475, 600}, new int[] {375, 475, 575}, 3);
		g.fillPolygon(new int[] {350, 475, 350}, new int[] {375, 475, 575}, 3);
	}
}