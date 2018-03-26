package abstract_factory;

import interface_.Product;
import product_human.ProductAlan;
import product_human.ProductBjarne;
import product_human.ProductLinus;

public class FactoryProductHumanComputerScience extends FactoryProductHuman  {
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