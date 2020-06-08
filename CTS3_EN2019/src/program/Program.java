package program;

import command.ICommand;
import command.InspectionCommand;
import command.OperatorService;
import proxy.Inspection;
import proxy.InspectionProxy;
import proxy.InspectionScheduler;
import proxy.Vehicle;
import template.clase.ServiceAutoColt;
import template.clase.ServiceAutoITP;
import template.clase.ServiceAutoTemplate;

public class Program {

	public static void main(String[] args) {
		ServiceAutoTemplate autoColt = new ServiceAutoColt("mihai bravu");
		ServiceAutoTemplate autoITP = new ServiceAutoITP("cobalcescu");
		autoColt.inspectVehicle();
		autoITP.inspectVehicle();

		Vehicle vehicle1 = new Vehicle(1300);
		Vehicle vehicle2 = new Vehicle(499);
		Vehicle vehicle3 = new Vehicle(3200);

		InspectionScheduler inspection = new Inspection(vehicle1);
		inspection.scheduleInspection();
		InspectionScheduler inspection2 = new Inspection(vehicle2);
		inspection2.scheduleInspection();
		InspectionScheduler inspection3 = new Inspection(vehicle3);
		inspection3.scheduleInspection();

		System.out.println("=====proxy=====");

		InspectionScheduler inspectionProxy1 = new InspectionProxy((Inspection) inspection);
		inspectionProxy1.scheduleInspection();
		InspectionScheduler inspectionProxy2 = new InspectionProxy((Inspection) inspection2);
		inspectionProxy2.scheduleInspection();
		InspectionScheduler inspectionProxy3 = new InspectionProxy((Inspection) inspection3);
		inspectionProxy3.scheduleInspection();

		System.out.println("=====command=====");
		OperatorService operator = new OperatorService();
		operator.add(new InspectionCommand(inspectionProxy2));
		operator.add(new InspectionCommand(inspection));
		operator.executeCommand();
		operator.executeCommand();

	}

}
