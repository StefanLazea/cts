package s3.g1079.paris.iannis.proxy;

import s3.g1079.paris.iannis.clase.IVehicle;
import s3.g1079.paris.iannis.clase.InspectionProcessingInterface;
import s3.g1079.paris.iannis.clase.InspectionScheduler;

public class Proxy implements InspectionProcessingInterface {
	//private Car c;
	private InspectionProcessingInterface inspectionProcessingInterface;


	@Override
	public void scheduleAnInspection(IVehicle vechicle) {
		// TODO Auto-generated method stub
		if(vechicle.getWeight() < 500) {
			inspectionProcessingInterface = new InspectionScheduler();
			inspectionProcessingInterface.scheduleAnInspection(vechicle);
		} else {
			System.out.println("CANT SCHEDULE INSPECTION");
		}
	}



}
