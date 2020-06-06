package clase;

public class RezervareBuilder implements IBuilder {
	private Rezervare rezervare;
	
	public RezervareBuilder() {
		this.rezervare = new Rezervare();
	}
	
	@Override
	public Rezervare build() {
		return this.rezervare;
	}
	
	public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
		this.rezervare.asezareLaGeam = asezareLaGeam;
		return this;
	}

	public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
		this.rezervare.scauneErgonomice = scauneErgonomice;
		return this;
	}

	public RezervareBuilder setDecorareaMesei(String decorareaMesei) {
		this.rezervare.decorareaMesei = decorareaMesei;
		return this;
	}

	public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.rezervare.muzicaAmbientala = muzicaAmbientala;
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.genMuzica = genMuzica;
		return this;
	}


}
