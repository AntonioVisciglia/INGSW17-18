package costructor_;

import java.awt.Graphics;

import productor_.*;

public class CostructorShape {

	public void drawShape(Graphics g) {}
	public ProductorShape getShape(){ return new ProductRedShape(); }
}