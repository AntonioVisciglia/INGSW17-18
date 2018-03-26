package product_human;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import interface_.Product;

public class ProductHuman implements Product{

	@Override
	public Image draw(Graphics g) {
		return new ImageIcon().getImage();
	}
	
}
