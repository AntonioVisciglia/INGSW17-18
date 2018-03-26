package interface_;

import java.awt.Graphics;
import java.awt.Image;

import gui.*;

public class Costructor {
	public void DrawComponent(Factory factory, Graphics g, MyPanel p){
		Product pA = factory.makeProductA();
		Product pB = factory.makeProductB();
		Product pC = factory.makeProductC();

		Image i = pA.draw(g);
		int tiledim = 4 * i.getWidth(p) / i.getHeight(p);
		g.drawImage(i, 460 - (i.getWidth(p)/2), 360 -(tiledim*2/5), p);
		
		i = pB.draw(g);
		g.drawImage(i, 460 - (i.getWidth(p)/2), (180 -(tiledim*2/5)), p);
		
		i = pC.draw(g);
		g.drawImage(i,  460 - (i.getWidth(p)/2), tiledim*2/5, p);
	}
}