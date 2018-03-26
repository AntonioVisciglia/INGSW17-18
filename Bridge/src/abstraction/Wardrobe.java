package abstraction;

import java.awt.Graphics;

import implementor.Iron;
import implementor.Material;
import implementor.Wood;
import util.ImageLoader;

public class Wardrobe extends Furniture{

	public Wardrobe(Material material) {
		super(material);
	}

	@Override
	public void applyMaterial() {
		material.getMaterial();
	}
}
