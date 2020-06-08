package cts.examen.s2.pattern2;

public abstract class Decorator implements Pacient {
	private Pacient pacient;
	protected String companionPersonName;

	public Decorator(Pacient pacient) {
		this.pacient = pacient;
	}

	public void setCompanion(String name) {
		this.companionPersonName = name;
	}

	@Override
	public String getDescription() {
		return this.pacient.getDescription() + " companion name " + this.companionPersonName;
	}
}
