package costructor_;

import java.awt.Graphics;

import productor_.*;

public class CostructorBlackPapillon extends CostructorShape {

	public void drawShape(Graphics g){
		ProductorShape p = new ProductorBlueMouseBlackPapillon();

		p.makeFace(g);
		p.makeEars(g);
		p.makeMustacces(g);
		p.makeEyes(g);
		p.makePapillon(g);
	}

	@Override
	public ProductorShape getShape() {
		return new ProductorBlueMouseBlackPapillon();
	}	
}
