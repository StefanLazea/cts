package builder2;

import clase.Rezervare;
import clase.RezervareBuilder;

public class RezervareBuilder2 implements IBuilder2 {
	public boolean asezareLaGeam;
	public boolean scauneErgonomice;
	public String decorareaMesei;
	public boolean muzicaAmbientala;
	public String genMuzica;
	
	public RezervareBuilder2() {
		this.asezareLaGeam = false;
		this.scauneErgonomice = true;
		this.decorareaMesei = "n/a";
		this.muzicaAmbientala = true;
		this.genMuzica = "rock";
	}
	
	@Override
	public Rezervare build() {
		return new Rezervare(this.asezareLaGeam,
				this.scauneErgonomice, 
				this.decorareaMesei, 
				this.muzicaAmbientala, 
				this.genMuzica);
	}
	
	
	public RezervareBuilder2 setAsezareLaGeam(boolean asezareLaGeam) {
		this.asezareLaGeam = asezareLaGeam;
		return this;
	}

	public RezervareBuilder2 setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
		return this;
	}

	public RezervareBuilder2 setDecorareaMesei(String decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
		return this;
	}

	public RezervareBuilder2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}

	public RezervareBuilder2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	
}
