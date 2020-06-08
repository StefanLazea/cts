package s3.g1079.paris.iannis.proxy;

import s3.g1079.paris.iannis.clase.IVehicle;
import s3.g1079.paris.iannis.clase.InspectionScheduler;

public class Car extends InspectionScheduler implements IVehicle {
	private double weight;
	private String model;
	
	public Car(double weight, String model) {
		super();
		this.weight = weight;
		this.model = model;
	}
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}
	@Override
	public void scheduleAnInspection(IVehicle vechicle) {
		// TODO Auto-generated method stub
		super.scheduleAnInspection(vechicle);
	}
	
	
	
}
