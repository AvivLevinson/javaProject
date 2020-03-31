package vehicles;

/**
 * HasEngine -abstract class,  represent the type of Engine that Vehicle have
 * 
 * 
 * @author aviv
 *
 */
public abstract class HasEngine extends Vehicle {
	
	//fuel amount for specific engine 
	private int fuelAmount;
	private int age;
	
	//with the engine object we can get details about the type engine 
	private Engine engine;
	
	/**
	 * refuel method update fuel amount for the vehicle by the capacity of each engine type, each engine type (benzine,solar) 
	 * have different capacity.  
	 * 
	 * @return false if the fuelAmount is full or true if refuel was successes.
	 */
	public boolean refuel() {
		
		if(this.fuelAmount != engine.fuelCapacity) {
			
			this.fuelAmount = engine.fuelCapacity;
			return true;
		}
		return false;
		
	}

}
