package s3.g1079.paris.iannis.junit;

import s3.g1079.paris.iannis.clase.IVehicle;

public class VehicleMock implements IVehicle{
	public int cost;

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Dacia";
	}
}
