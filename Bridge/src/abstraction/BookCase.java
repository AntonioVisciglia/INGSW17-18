package abstraction;

import implementor.Material;

public class BookCase extends Furniture {

	public BookCase(Material material) {
		super(material);
	}

	@Override
	public void applyMaterial() {
		material.getMaterial();
	}
}
