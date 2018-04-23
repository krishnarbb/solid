package liskovSubstitionPrinciple.violation;

import liskovSubstitionPrinciple.solution.RectangleFactory;

//Objects should be replaceable with instances of their subtypes w/o altering
//the correctness of the program.
public class LSP {
	
	public static void process(Rectangle r) {
		
		// this code is fundamentally correct, as we work with Rectangle.
		// However, not correct for subtype (Square). This violates LSP.
		// To fix this , the solution is to never have a square class.
		// Instead, use FactoryPattern to create. Say RectangleFactory which creates Rectangle and Square.
		
		int w = r.getWidth();
		r.setHeight(10);
			
		int expectedArea = w*10;
		int actualArea = r.area();
		
	    System.out.println("ExpectedArea :" + expectedArea);
	    System.out.println("ActualArea :" + actualArea);
	}
	
	public static void main(String ...args) {
		Rectangle r = new Rectangle(5,5);
	    process(r);
	    
	    Square s = new Square(5);
	    process(s);
	    
	    // solution
	    Rectangle square = RectangleFactory.createSquare(5);
	    process(square);
	    
	    
	}
}
