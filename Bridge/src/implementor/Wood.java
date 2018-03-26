package implementor;

public class Wood implements Material {
	@Override
	public Material getMaterial() {
		return this;
	}
}