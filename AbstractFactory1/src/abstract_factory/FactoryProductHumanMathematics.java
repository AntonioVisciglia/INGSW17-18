package abstract_factory;

import interface_.Product;
import product_human.*;

public class FactoryProductHumanMathematics extends FactoryProductHuman{
	@Override
	public Product makeProductA(){
		return new ProductAndrew();
	}
	@Override
	public Product makeProductB(){
		return new ProductGauss();
	}
	@Override
	public Product makeProductC(){
		return new ProductChauchy();
	}
}