package productor_;

import java.awt.Color;
import java.awt.Graphics;

public class ProductBlue_Black extends ProductGreenShape {
	@Override
	public void makeFace(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(300, 200, 300, 300);
	}
}
