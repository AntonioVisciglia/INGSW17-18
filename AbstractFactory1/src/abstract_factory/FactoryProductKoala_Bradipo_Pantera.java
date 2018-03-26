package abstract_factory;

import interface_.Product;
import product_animal.*;

public class FactoryProductKoala_Bradipo_Pantera extends FactoryProoductAnimal {
	@Override
	public Product makeProductA(){
		return new ProductKoala();
	}
	@Override
	public Product makeProductB(){
		return new ProductBradipo();
	}
	@Override
	public Product makeProductC(){
		return new ProductPantera();
	}
}
