package interface_;

import product_animal.*;

public class Factory {
	public  Product makeProductA(){
		return new ProductDogHusky();
	}
	public Product makeProductB(){
		return new ProductButterflyMaoriij();
	}
	public Product makeProductC(){
		return new ProductPeacockGreen();
	}
}