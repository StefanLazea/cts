package template.clase;

public class ServiceAutoITP extends ServiceAutoTemplate {

	public ServiceAutoITP(String location) {
		super(location);
	}

	@Override
	public void vehicleVisualCheck() {
		System.out.println("visual check ok");
	}

	@Override
	public void vehicleExhaustCheck() {
		System.out.println("exhaust check ok");

	}

	@Override
	public void brakesCheck() {
		System.out.println("brakes check ok");

	}

	@Override
	public void mechanicalPartsCheck() {
		System.out.println("mechanical parts check ok");

	}

}
