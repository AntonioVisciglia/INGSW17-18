package product_human;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductGauss extends ProductHuman {
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/gauss.png").getImage();
	}
}