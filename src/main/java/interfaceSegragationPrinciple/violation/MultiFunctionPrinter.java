package interfaceSegragationPrinciple.violation;


// This client is forced to implement interfaces, eventhe ones it does not require. 
public class MultiFunctionPrinter implements IMachine {

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan(Document d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fax(Document d) {
		// TODO Auto-generated method stub
		
	}

}
