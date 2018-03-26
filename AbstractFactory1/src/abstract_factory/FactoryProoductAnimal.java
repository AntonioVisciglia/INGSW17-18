package abstract_factory;

import interface_.Factory;
import interface_.Product;
import product_animal.*;

public class FactoryProoductAnimal extends Factory {
	@Override
	public Product makeProductA(){
		return new ProductDogHusky();
	}
	@Override
	public Product makeProductB(){
		return new ProductButterflyMaoriij();
	}
	@Override
	public Product makeProductC(){
		return new ProductPeacockGreen();
	}
}