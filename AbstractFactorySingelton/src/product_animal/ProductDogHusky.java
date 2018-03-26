package product_animal;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProductDogHusky extends ProductsAnimal{
	@Override
	public Image draw(Graphics g) {
		return new ImageIcon("resource/husky.png").getImage();
	}
}
