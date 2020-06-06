package clase;

public class Pacient {
	private ModPlata modPlata;
	private String nume;

	public Pacient(String nume) {
		super();
		this.nume = nume;
		this.modPlata = new Card();
	}
	
	public void platesteSpitalizare(float suma) {
		this.modPlata.plateste(this.nume, suma);
	}
	
	public ModPlata getModPlata() {
		return modPlata;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

}