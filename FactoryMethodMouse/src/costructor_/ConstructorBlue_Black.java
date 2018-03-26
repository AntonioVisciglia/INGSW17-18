package costructor_;

import java.awt.Graphics;

import productor_.ProductBlue_Black;
import productor_.ProductorBlueMouseBlackPapillon;
import productor_.ProductorShape;

public class ConstructorBlue_Black extends CostructorShape {

	public void drawShape(Graphics g){
		ProductorShape p = new ProductBlue_Black();

		p.makeFace(g);
		p.makeEars(g);
		p.makeMustacces(g);
		p.makeEyes(g);
		p.makePapillon(g);
	}

	@Override
	public ProductorShape getShape() {
		return new ProductBlue_Black();
	}
}
