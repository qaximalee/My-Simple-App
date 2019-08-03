
public class Toyota implements FourWheeler, Vehicle{

	@Override
	public void engineSpec() {
		// TODO Auto-generated method stub
		System.out.println("Engine is Present");
	}

	@Override
	public void weight() {
		// TODO Auto-generated method stub
		System.out.println("Weight is different with respect to vehicles");
	}

	@Override
	public void speedMeter() {
		// TODO Auto-generated method stub
		System.out.println("Speed Meter of Toyota");
	}

	@Override
	public void fuelMeter() {
		// TODO Auto-generated method stub
		System.out.println("Fuel Meter of Toyota");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		FourWheeler.super.show();
	}

}
