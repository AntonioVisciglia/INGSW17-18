package abstract_factory;

import interface_.Product;
import product_animal.*;

public class FactoryProductDog_Butter_Peacock extends FactoryProoductAnimal {
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
