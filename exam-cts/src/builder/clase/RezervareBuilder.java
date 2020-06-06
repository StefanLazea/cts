package builder.clase;

public class RezervareBuilder implements IBuilder {
	private Rezervare rezervare;

	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare();
	}

	@Override
	public Rezervare build() {
		return this.rezervare;
	}

	public RezervareBuilder setMasaInclusa(boolean masaInclusa) {
		this.rezervare.setMasaInclusa(masaInclusa);
		return this;
	}

	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		this.rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}

	public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.rezervare.setBauturaRacoritoare(bauturaRacoritoare);
		return this;
	}

	public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
}
