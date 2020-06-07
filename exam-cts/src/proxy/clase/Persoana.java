package proxy.clase;

public class Persoana {
	private String nume;
	private int varsta;

	public Persoana(String nume, int v) {
		super();
		this.nume = nume;
		this.varsta = v;
	}

	public String getNume() {
		return nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

}
