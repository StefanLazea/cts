package proxy;

public class InspectionProxy implements InspectionScheduler{
	private Inspection inspection;
		
	public InspectionProxy(Inspection inspection) {
		super();
		this.inspection = inspection;
	}

	@Override
	public void scheduleInspection() {
		if(this.inspection.getVehicul().getWeight() < 500) {
			this.inspection.scheduleInspection();
		}else {
			System.out.println("Sorry! We can't accept this inspection");
		}
		
	}

	

}
