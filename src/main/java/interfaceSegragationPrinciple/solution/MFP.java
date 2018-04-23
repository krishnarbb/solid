package interfaceSegragationPrinciple.solution;

import interfaceSegragationPrinciple.violation.Document;

//Use Decorator pattern to weave the required functionality.
public class MFP   {

	IPrinter p; 
	IScanner s;
	
	
	public void print(Document d) {
		
		p.print(d);
	}
	
	public void scan(Document d) {
		s.scan(d);
		
	}

}
