package abstract_factory;

import interface_.Factory;
import interface_.Product;
import product_animal.*;

public class FactoryProoductAnimal extends Factory {
	private static FactoryProoductAnimal istance;
	protected FactoryProoductAnimal(){}

	public static FactoryProoductAnimal istance(){
		if( istance == null ){
			System.out.println("FactoryProductDog_Butter_Peacock");
			istance = new FactoryProoductAnimal();
		}
		return istance;
	}
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