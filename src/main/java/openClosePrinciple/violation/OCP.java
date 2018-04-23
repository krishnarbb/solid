package openClosePrinciple.violation;

import java.util.ArrayList;
import java.util.List;

import openClosePrinciple.solution.AndSpecification;
import openClosePrinciple.solution.BetterFilter;
import openClosePrinciple.solution.ColorSpecification;
import openClosePrinciple.solution.SizeSpecification;

/**
 * Open for extension, but closed for modification.
 * 
 * See ProductFilter class for the problem with OCP violation.
 * 
 * Patter used for solving the OCP violation is : Specification Pattern.
 * 
 * Its a pattern used with Data Access quite a lot.
 *
 */
public class OCP {
	
	public static void main(String ...args) {
		Product apple = new Product("Apple", Color.Green, Size.Small);
		Product tree = new Product("Tree", Color.Green, Size.Large);
		Product house = new Product("House", Color.Blue, Size.Medium);
		
		List<Product> all = new ArrayList<>();
		all.add(apple);
		all.add(tree);
		all.add(house);
		
		BetterFilter bf = new BetterFilter();
		ColorSpecification greenColorSpecification = new ColorSpecification(Color.Green);
		
		List<Product> greenThings = bf.filter(all, greenColorSpecification);
		
		SizeSpecification smallSizeSpecification = new SizeSpecification(Size.Small);
		
		AndSpecification andSpecification = new AndSpecification(greenColorSpecification, smallSizeSpecification);
		
		List<Product> greenAndSmallThings = bf.filter(all, andSpecification);
		
		
	}

}
