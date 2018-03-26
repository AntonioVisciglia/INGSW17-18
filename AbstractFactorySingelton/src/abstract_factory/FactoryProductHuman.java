package abstract_factory;

import interface_.Factory;
import interface_.Product;
import product_human.*;

public class FactoryProductHuman extends Factory {

	private static FactoryProductHuman istance;
	protected FactoryProductHuman(){}

	public static FactoryProductHuman istance(){
		if( istance == null ){
			System.out.println("FactoryProductDog_Butter_Peacock");
			istance = new FactoryProductHuman();
		}
		return istance;
	}

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