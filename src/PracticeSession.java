class Dog{

protected void eat() {
		System.out.println("dog is eating...");
	}
}

public class PracticeSession extends Dog{

	static int results;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Toyota vehicles = new Toyota();
		System.out.println("Double Interface with TOyota Class");
		vehicles.show();
		vehicles.fuelMeter();
		vehicles.speedMeter();
		vehicles.engineSpec();
		vehicles.weight();
		
		
		System.out.println("Carola XLI");
		
		CarolaXLI carolaXLI = new CarolaXLI();
		carolaXLI.engineSpec();
		carolaXLI.speedMeter();
		carolaXLI.fuelMeter();
		carolaXLI.weight();
		carolaXLI.show();
		
		
		
		int addition = new InnerClasses(){

			@Override
			public int getAddition(int a, int b) {
				// TODO Auto-generated method stub
				
				results = a+b;
				
				return a+b;
			}
			
		}.getAddition(6, 7);
		
		System.out.println("Addition By Interface: "+addition);
		System.out.println("Addition By Interface1: "+results);
		
		Dog d1 = new Dog();
		d1.eat();
	/*	Vehicle vehicle = new Suzuku();
		vehicle.show();
		vehicle.fuelMeter();
		vehicle.speedMeter();
		FourWheeler fourWheeler = new Toyota();
		fourWheeler.show();
		fourWheeler.engineSpec();
		fourWheeler.weight();*/
	}

}
