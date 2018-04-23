package openClosePrinciple.violation;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter {
	
	public static List<Product> byColour(final List<Product> products, final  Color color) {
		final List<Product> result = new ArrayList<>();
		for(final Product product : products) {
			if (product.getColor() == color) {
				result.add(product);
			}
		}
		return result;
	}
	
	//A new requirement to filter by size. This function is same as above except for the size
	public static List<Product> bySize(final List<Product> products, final  Size size) {
		final List<Product> result = new ArrayList<>();
		for(final Product product : products) {
			if (product.getSize() == size) {
				result.add(product);
			}
		}
		return result;
	}
	
	// now there is a new requirement to filter by both size and color.
	// So the complexity of this is exploding, eventually if there is more than just color and size.
	
	
	// So the problem here is , instead of opening up the class the class for extension, 
	// we are opening up this class for modification.   
	// This is a violation of OCP.
	
	// Its better to make a much robust filter structure where the filtering can be Dynamically arranged later on.
	// Patter used for solving the OCP violation is : Specification Pattern. Refer to OCP Class.
	public static List<Product> byColorAndSize(final List<Product> products,final  Color color, final  Size size) {
		final List<Product> result = new ArrayList<>();
		for(final Product product : products) {
			if (product.getColor() == color && product.getSize() == size) {
				result.add(product);
			}
		}
		return result;
	}
	

}
