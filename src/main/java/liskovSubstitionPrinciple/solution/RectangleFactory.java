package liskovSubstitionPrinciple.solution;

import liskovSubstitionPrinciple.violation.Rectangle;


public class RectangleFactory {
	
	public static Rectangle createRectangle(int w, int h) {
		return new Rectangle(w, h);
	}
	
	public static Rectangle createSquare(int s) {
		return new Rectangle(s, s);
	}
}
