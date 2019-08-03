
public interface Vehicle {

	public void speedMeter();
	public void fuelMeter();
	
	
	default void show(){
		System.out.println("Vehicle interface...");
	}
	
}
