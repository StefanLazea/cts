package builder.clase;

public class Rezervare {
	private boolean masaInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;

	public Rezervare(boolean masaInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare, boolean muzicaAmbientala,
			String genMuzica) {
		super();
		this.masaInclusa = masaInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaRacoritoare = bauturaRacoritoare;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
	}

	public Rezervare() {
		this.masaInclusa = false;
		this.scaunErgonomic = false;
		this.bauturaRacoritoare = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "n/a";
	}

	public boolean isMasaInclusa() {
		return masaInclusa;
	}

	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}

	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}

	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setMasaInclusa(boolean masaInclusa) {
		this.masaInclusa = masaInclusa;
	}

	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}

	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}

	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		return "Rezervare [masaInclusa=" + masaInclusa + ", scaunErgonomic=" + scaunErgonomic + ", bauturaRacoritoare="
				+ bauturaRacoritoare + ", muzicaAmbientala=" + muzicaAmbientala + ", genMuzica=" + genMuzica + "]";
	}
	
	

}
