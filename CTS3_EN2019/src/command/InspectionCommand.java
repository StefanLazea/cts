package command;

import proxy.InspectionScheduler;

public class InspectionCommand implements ICommand {
	private InspectionScheduler inspection;

	public InspectionCommand(InspectionScheduler inspection) {
		super();
		this.inspection = inspection;
	}

	@Override
	public void execute() {
		this.inspection.scheduleInspection();
	}

}
