package productor_;

import java.awt.Color;
import java.awt.Graphics;

public class ProductorBlueMouseBlackPapillon extends ProductBlueShape {
	@Override
	public void makePapillon(Graphics g) {
		g.setColor(Color.black);
		g.translate(-25, 0);
		g.fillPolygon(new int[] {600, 475, 600}, new int[] {375, 475, 575}, 3);
		g.fillPolygon(new int[] {350, 475, 350}, new int[] {375, 475, 575}, 3);
	}

	@Override
	public void makeEyes(Graphics g) {
		// bulbi
			g.setColor(Color.yellow);
			g.fillOval(360, 275, 50, 50);
			g.fillOval(490, 275, 50, 50);
		// pupille
			g.setColor(Color.black);
			g.fillOval(375, 290, 20, 20);
			g.fillOval(505, 290, 20, 20);
	}
}
