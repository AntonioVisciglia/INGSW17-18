package product_animal;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductBradipo extends ProductsAnimal{
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/bradipo.png").getImage();
	}
}