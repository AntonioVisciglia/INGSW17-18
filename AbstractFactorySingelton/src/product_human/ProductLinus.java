package product_human;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductLinus extends ProductHuman{
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/linus.png").getImage();
	}
}
