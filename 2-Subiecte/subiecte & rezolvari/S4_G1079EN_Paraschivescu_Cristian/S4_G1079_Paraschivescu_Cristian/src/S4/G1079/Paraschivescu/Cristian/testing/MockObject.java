package S4.G1079.Paraschivescu.Cristian.testing;

import S4.G1079.Paraschivescu.Cristian.surse.IVehicle;

public class MockObject implements IVehicle {

	private double weight;
	private String model;
	
	
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Dacia";
	}

}
