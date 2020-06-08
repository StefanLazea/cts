package template.clase;

public abstract class ServiceAutoTemplate {
	private String location;

	public ServiceAutoTemplate(String location) {
		super();
		this.location = location;
	}

	public abstract void vehicleVisualCheck();

	public abstract void vehicleExhaustCheck();

	public abstract void brakesCheck();

	public abstract void mechanicalPartsCheck();

	public final void inspectVehicle() {
		this.vehicleExhaustCheck();
		this.vehicleExhaustCheck();
		this.brakesCheck();
		this.mechanicalPartsCheck();
	}
}
