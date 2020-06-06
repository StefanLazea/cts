package clase;

public class Rezervare {
	public boolean asezareLaGeam;
	public boolean scauneErgonomice;
	public String decorareaMesei;
	public boolean muzicaAmbientala;
	public String genMuzica;
	
	public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, String decorareaMesei, boolean muzicaAmbientala,
			String genMuzica) {
		super();
		this.asezareLaGeam = asezareLaGeam;
		this.scauneErgonomice = scauneErgonomice;
		this.decorareaMesei = decorareaMesei;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
	}
	

	public Rezervare() {
		super();
		this.asezareLaGeam = false;
		this.scauneErgonomice = true;
		this.decorareaMesei = "n/a";
		this.muzicaAmbientala = true;
		this.genMuzica = "rock";
	}


	public boolean isAsezareLaGeam() {
		return asezareLaGeam;
	}


	public boolean isScauneErgonomice() {
		return scauneErgonomice;
	}


	public String getDecorareaMesei() {
		return decorareaMesei;
	}


	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}


	public String getGenMuzica() {
		return genMuzica;
	}


	public void setAsezareLaGeam(boolean asezareLaGeam) {
		this.asezareLaGeam = asezareLaGeam;
	}


	public void setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
	}


	public void setDecorareaMesei(String decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
	}


	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}


	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}


	@Override
	public String toString() {
		return "Rezervare [asezareLaGeam=" + asezareLaGeam + ", scauneErgonomice=" + scauneErgonomice
				+ ", decorareaMesei=" + decorareaMesei + ", muzicaAmbientala=" + muzicaAmbientala + ", genMuzica="
				+ genMuzica + "]";
	}
	
	
	
}
