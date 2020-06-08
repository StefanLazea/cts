package proxy;

public class Vehicle implements IVehicle {
	private int weight;

	public Vehicle(int weight) {
		super();
		this.weight = weight;
	}

	@Override
	public void description() {
		System.out.print("The vehicle has " + this.weight + "kg");
	}

	public int getWeight() {
		return weight;
	}

}
