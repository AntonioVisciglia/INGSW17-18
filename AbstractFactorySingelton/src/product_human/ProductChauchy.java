package product_human;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductChauchy extends ProductHuman{
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/cauchy.png").getImage();
	}
}
