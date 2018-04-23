package openClosePrinciple.solution;

import openClosePrinciple.violation.Color;
import openClosePrinciple.violation.Product;

public class ColorSpecification implements ISpecification<Product> {

	Color color;
	
	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfies(Product product) {
		if (product.getColor() == this.color) {
			return true;
		}
		return false;
	} 

}
