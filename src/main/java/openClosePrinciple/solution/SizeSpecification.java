package openClosePrinciple.solution;

import openClosePrinciple.violation.Color;
import openClosePrinciple.violation.Product;
import openClosePrinciple.violation.Size;

public class SizeSpecification implements ISpecification<Product> {

	Size size;
	
	public SizeSpecification(Size size) {
		this.size = size;
	}

	@Override
	public boolean isSatisfies(Product product) {
		if (product.getSize() == this.size) {
			return true;
		}
		return false;
	} 

}
