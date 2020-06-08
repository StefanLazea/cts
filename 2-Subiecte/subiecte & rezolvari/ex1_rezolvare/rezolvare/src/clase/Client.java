package clase;

public class Client {
	private String nume;
	private int varsta;
	private float salariu;

	public Client(String nume, int varsta, float salariu) {
		this.nume = nume;
		this.varsta = varsta;
		this.salariu = salariu;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public float getSalariu() {
		return salariu;
	}

	public void setSalariu(float salariu) {
		this.salariu = salariu;
	}
}
