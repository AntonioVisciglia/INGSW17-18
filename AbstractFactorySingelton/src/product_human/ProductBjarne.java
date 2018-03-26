package product_human;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductBjarne extends ProductHuman {
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/c++.png").getImage();
	}
}
