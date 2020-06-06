package facade.clase;

public class Persoana {
	private String serieBuletin;
	private String nume;

	public Persoana(String serieBuletin, String nume) {
		super();
		this.serieBuletin = serieBuletin;
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Persoana [serieBuletin=" + serieBuletin + ", nume=" + nume + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getSerieBuletin() {
		return serieBuletin;
	}

	public void setSerieBuletin(String serieBuletin) {
		this.serieBuletin = serieBuletin;
	}

}
