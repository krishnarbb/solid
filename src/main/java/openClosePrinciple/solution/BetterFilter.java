package openClosePrinciple.solution;

import java.util.ArrayList;
import java.util.List;

import openClosePrinciple.violation.Product;

public class BetterFilter implements IFilter<Product> {

	@Override
	public  List<Product> filter(final List<Product> items, final ISpecification<Product> spec) {
		final List<Product> result = new ArrayList<>();
		for(final Product product : items) {
			if (spec.isSatisfies(product)) {
				result.add(product);
			}
		}
		return result;
	}

}
