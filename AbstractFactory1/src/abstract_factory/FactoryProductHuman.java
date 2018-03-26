package abstract_factory;

import interface_.Factory;
import interface_.Product;
import product_human.*;

public class FactoryProductHuman extends Factory {
	@Override
	public Product makeProductA(){
		return new ProductLinus();
	}
	@Override
	public Product makeProductB(){
		return new ProductAlan();
	}
	@Override
	public Product makeProductC(){
		return new ProductBjarne();
	}
}