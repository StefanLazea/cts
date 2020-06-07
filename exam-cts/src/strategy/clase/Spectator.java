package strategy.clase;

public class Spectator {
	private String nume;
	private ITipVerificare tipVerificare;

	public Spectator(String nume) {
		super();
		this.nume = nume;
		this.tipVerificare = new Peluza();
	}

	public ITipVerificare getTipVerificare() {
		return tipVerificare;
	}

	public void setTipVerificare(ITipVerificare tipVerificare) {
		this.tipVerificare = tipVerificare;
	}

	public void intrareStadion() {
		this.tipVerificare.verifica(this.nume);
	}

}
