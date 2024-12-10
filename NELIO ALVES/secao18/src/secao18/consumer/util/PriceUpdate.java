package secao18.consumer.util;

import java.util.function.Consumer;

import secao18.consumer.entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);		
	}
	
	

}
