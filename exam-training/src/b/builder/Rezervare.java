package b.builder;

public class Rezervare {
	private boolean asezareLaGeam;
	private boolean scaunErgonomic;
	private boolean muzicaAmbientala;
	private boolean decorareaMesei;
	private String genMuzica;

	public Rezervare(boolean asezareLaGeam, boolean scaunErgonomic, boolean muzicaAmbientala, boolean decorareaMesei,
			String genMuzica) {
		super();
		this.asezareLaGeam = asezareLaGeam;
		this.scaunErgonomic = scaunErgonomic;
		this.muzicaAmbientala = muzicaAmbientala;
		this.decorareaMesei = decorareaMesei;
		this.genMuzica = genMuzica;
	}

	public Rezervare() {
		super();
		this.asezareLaGeam = false;
		this.scaunErgonomic = false;
		this.muzicaAmbientala = false;
		this.decorareaMesei = false;
		this.genMuzica = "n/a";
	}

	public boolean isAsezareLaGeam() {
		return asezareLaGeam;
	}

	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}

	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}

	public boolean isDecorareaMesei() {
		return decorareaMesei;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setAsezareLaGeam(boolean asezareLaGeam) {
		this.asezareLaGeam = asezareLaGeam;
	}

	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}

	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	public void setDecorareaMesei(boolean decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		return "Rezervare [asezareLaGeam=" + asezareLaGeam + ", scaunErgonomic=" + scaunErgonomic
				+ ", muzicaAmbientala=" + muzicaAmbientala + ", decorareaMesei=" + decorareaMesei + ", genMuzica="
				+ genMuzica + "]";
	}
	

}
