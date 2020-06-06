package clase;

public class Candidat {

	private String nume;
	private boolean areCompManageriale;
	private boolean areCompProgramare;
	private boolean areCompTestare;

	public Candidat(String nume, boolean areCompManageriale, boolean areCompProgramare, boolean areCompTestare) {
		super();
		this.nume = nume;
		this.areCompManageriale = areCompManageriale;
		this.areCompProgramare = areCompProgramare;
		this.areCompTestare = areCompTestare;
	}

	public String getNume() {
		return nume;
	}

	public boolean getAreCompManageriale() {
		return areCompManageriale;
	}

	public boolean getAreCompProgramare() {
		return areCompProgramare;
	}

	public boolean getAreCompTestare() {
		return areCompTestare;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setAreCompManageriale(boolean areCompManageriale) {
		this.areCompManageriale = areCompManageriale;
	}

	public void setAreCompProgramare(boolean areCompProgramare) {
		this.areCompProgramare = areCompProgramare;
	}

	public void setAreCompTestare(boolean areCompTestare) {
		this.areCompTestare = areCompTestare;
	}

	@Override
	public String toString() {
		return "Candidat [nume=" + nume + ", areCompManageriale=" + areCompManageriale + ", areCompProgramare="
				+ areCompProgramare + ", areCompTestare=" + areCompTestare + "]";
	}

}
