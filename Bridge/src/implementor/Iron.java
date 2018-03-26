package implementor;

public class Iron implements Material {
	@Override
	public Material getMaterial() {
		return this;
	}
}
