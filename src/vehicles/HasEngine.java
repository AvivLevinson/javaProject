package vehicles;

public abstract class HasEngine extends Vehicle {
	
	private int fuelAmount;
	private int age;
	
	private Engine engine;
	
	
	public boolean refuel() {
		
		if(this.fuelAmount != engine.fuelCapacity) {
			
			this.fuelAmount = engine.fuelCapacity;
			return true;
		}
		return false;
		
	}

}
