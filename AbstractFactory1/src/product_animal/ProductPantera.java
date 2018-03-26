package product_animal;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductPantera extends ProductsAnimal{
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/pantera.png").getImage();
	}
}