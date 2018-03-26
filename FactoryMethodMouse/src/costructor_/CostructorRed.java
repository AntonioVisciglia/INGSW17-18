package costructor_;

import java.awt.Graphics;

import productor_.ProductGreenShape;
import productor_.ProductRedShape;
import productor_.ProductorShape;

public class CostructorRed extends CostructorShape{

	public void drawShape(Graphics g){
		ProductorShape p = new ProductRedShape();

		p.makeFace(g);
		p.makeEars(g);
		p.makeMustacces(g);
		p.makeEyes(g);
		p.makePapillon(g);
	}

	@Override
	public ProductorShape getShape() {
		return new ProductRedShape();
	}
}
