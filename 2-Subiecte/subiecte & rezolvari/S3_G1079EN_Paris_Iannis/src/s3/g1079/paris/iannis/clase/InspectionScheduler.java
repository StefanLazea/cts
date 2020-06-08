package s3.g1079.paris.iannis.clase;


public class InspectionScheduler implements InspectionProcessingInterface{

	@Override
	public void scheduleAnInspection(IVehicle vechicle) {
		System.out.println("Scheduling an inspection for " + vechicle.getModel());
	}
	
}
