package costructor_;

import java.awt.Graphics;

import productor_.*;

public class CostructorBlue extends CostructorShape {
	public void drawShape(Graphics g){
		ProductorShape p = new ProductBlueShape();

		p.makeFace(g);
		p.makeEars(g);
		p.makeMustacces(g);
		p.makeEyes(g);
		p.makePapillon(g);
	}

	@Override
	public ProductorShape getShape() {
		return new ProductBlueShape();
	}
}
