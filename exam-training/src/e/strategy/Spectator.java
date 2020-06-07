package e.strategy;

public class Spectator {
	private String nume;
	private IModVerificare modVerificare;

	public Spectator(String nume) {
		super();
		this.nume = nume;
		this.modVerificare = new Peluza();
	}

	public void verificareMeci() {
		this.modVerificare.verifica(this.nume);
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setModVerificare(IModVerificare modVerificare) {
		this.modVerificare = modVerificare;
	}

}
