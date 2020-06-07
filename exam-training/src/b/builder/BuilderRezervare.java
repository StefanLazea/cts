package b.builder;

public class BuilderRezervare implements IBuilder{
	private Rezervare rezervare;
		
	public BuilderRezervare() {
		super();
		this.rezervare = new Rezervare();
	}

	@Override
	public Rezervare build() {
		return this.rezervare;
	}
	
	public BuilderRezervare setAsezareLaGeam(boolean asezareLaGeam) {
		this.rezervare.setAsezareLaGeam(asezareLaGeam);
		return this;
	}

	public BuilderRezervare setScaunErgonomic(boolean scaunErgonomic) {
		this.rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}

	public BuilderRezervare setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}

	public BuilderRezervare setDecorareaMesei(boolean decorareaMesei) {
		this.rezervare.setDecorareaMesei(decorareaMesei); 
		return this;
	}

	public BuilderRezervare setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}

}
