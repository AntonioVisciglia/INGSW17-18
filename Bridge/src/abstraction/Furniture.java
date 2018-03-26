package abstraction;

import java.awt.Graphics;

import implementor.Material;

public abstract class Furniture {
	Material material;

	public Furniture(Material material) {
		this.material = material;
	}

	public abstract void applyMaterial();
	public void drawFurniture(Graphics g, String s) {
		Material.draw(g,s);
	}
}
