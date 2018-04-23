package openClosePrinciple.solution;

import openClosePrinciple.violation.Product;

public class AndSpecification implements ISpecification<Product> {
	
	ISpecification<Product> first;
	ISpecification<Product> second;
	
	public AndSpecification(ISpecification<Product> first, ISpecification<Product> second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfies(Product item) {
		return first.isSatisfies(item) && second.isSatisfies(item);
	}

}
