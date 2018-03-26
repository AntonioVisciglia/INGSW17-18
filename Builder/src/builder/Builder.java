package builder;

import product.Product;

public interface Builder {
	public void setTitle();
	public void setSubTitle();
	public void setBody();

	public Product getBuilder();
}