package template.clase;

public class ServiceAutoColt extends ServiceAutoTemplate{

	public ServiceAutoColt(String location) {
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
		System.out.println("can't perform this check");
		
	}

	@Override
	public void mechanicalPartsCheck() {
		System.out.println("mechanical check ok");
		
	}

}
