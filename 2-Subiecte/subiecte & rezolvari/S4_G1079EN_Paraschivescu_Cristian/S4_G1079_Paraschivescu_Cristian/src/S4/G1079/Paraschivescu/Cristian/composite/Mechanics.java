package S4.G1079.Paraschivescu.Cristian.composite;

public class Mechanics extends ANod {
	private String name;
	
	public Mechanics(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getInfo() {
		return this.name;
	}

}
