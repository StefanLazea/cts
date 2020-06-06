package flyweight.clase;

public class Optionale {
	private String pozitie;
	private String culoareTricou;

	public Optionale(String pozitie, String culoareTricou) {
		super();
		this.pozitie = pozitie;
		this.culoareTricou = culoareTricou;
	}

	public String getPozitie() {
		return pozitie;
	}

	public String getCuloareTricou() {
		return culoareTricou;
	}

	public void setPozitie(String pozitie) {
		this.pozitie = pozitie;
	}

	public void setCuloareTricou(String culoareTricou) {
		this.culoareTricou = culoareTricou;
	}

}
