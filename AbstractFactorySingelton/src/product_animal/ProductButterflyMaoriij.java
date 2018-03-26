package product_animal;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductButterflyMaoriij extends ProductsAnimal{
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/farfalla_maorji.png").getImage();
	}
}