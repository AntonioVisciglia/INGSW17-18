package product_animal;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import interface_.Factory;
import interface_.Product;

public class ProductsAnimal implements Product{
	public Image draw(Graphics g){
		return new ImageIcon().getImage();
	}
}
