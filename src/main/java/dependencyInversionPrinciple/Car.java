package dependencyInversionPrinciple;

public class Car {
	
	Engine engine;
	// Engine can be injected using any DI framework
	public Car(Engine e) {
		this.engine = e;
	}
 
}
