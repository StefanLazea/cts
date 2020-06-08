package composite.clase;

public class AutoMechanics implements ICompositeCategory {
	private String jobTitle;

	public AutoMechanics(String jobTitle) {
		super();
		this.jobTitle = jobTitle;
	}

	@Override
	public void addMechanic(ICompositeCategory mechanic) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ICompositeCategory getMechanic(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteMechanic(ICompositeCategory mechanic) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void description(String delimiter) {
		System.out.println(delimiter+ "This member is a " + this.jobTitle);
	}

}
