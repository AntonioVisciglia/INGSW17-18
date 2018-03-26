package product_human;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductAlan extends ProductHuman{
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/alan.png").getImage();
	}
}
