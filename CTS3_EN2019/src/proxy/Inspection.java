package proxy;

public class Inspection implements InspectionScheduler {
	private Vehicle vehicul;

	public Inspection(Vehicle vehicul) {
		super();
		this.vehicul = vehicul;
	}

	@Override
	public void scheduleInspection() {
		this.vehicul.description();
		System.out.print(" has been programmed for the periodical inspection");
		System.out.println();
	}

	public Vehicle getVehicul() {
		return vehicul;
	}

}
