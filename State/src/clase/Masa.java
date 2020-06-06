package clase;

public class Masa {
	private IStare stare;
	private int nrMasa;

	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new StareLibera();
	}

	public void setStare(IStare stare) {
		this.stare = stare;
	}

	public IStare getStare() {
		return stare;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public void rezerva() {
		if (stare instanceof StareLibera) {
			this.stare = new StareRezervata();
			this.stare.afisareStare(this.nrMasa);
		} else {
			System.out.println("Masa " + this.nrMasa + " nu poate fi rezervata");
		}
	}

	public void ocupa() {
		if (!(this.stare instanceof StareOcupata)) {
			this.stare = new StareOcupata();
			this.stare.afisareStare(this.nrMasa);
		} else {
			System.out.println("Masa " + this.nrMasa + " este deja ocupata");
		}
	}

	public void elibereaza() {
		if (!(this.stare instanceof StareLibera)) {
			this.stare = new StareLibera();
			stare.afisareStare(this.nrMasa);
		} else {
			System.out.println("Masa " + this.nrMasa + " este deja libera");
		}
	}
}
